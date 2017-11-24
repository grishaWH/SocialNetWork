package Commands.Implements;

import Commands.Command;
import Commands.Receiver;
import Models.Network;

import java.util.Scanner;

public class Authorization implements Command {
    private final Receiver receiver;

    public Authorization(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Network network = receiver.getNetwork();
        Scanner scanner = new Scanner(System.in);
        String login, password;
        if(network.validationTheEntrance() && network.getUserList()!=null){
            System.out.print("Enter login: ");
            login = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            if(network.connectToNetWork(login, password)) {
                network.addCurrentUser(network.getUser(login));
                System.out.println("Welcome " + network.getCurrentUser().getLogin()+ " to the Social network");
            }
            else
                System.out.println("Login or password incorrect");
        }else
            System.out.println("User doesn't exist");
    }
}
