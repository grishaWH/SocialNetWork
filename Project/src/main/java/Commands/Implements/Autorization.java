package Commands.Implements;

import Commands.Command;
import Commands.Invoker;
import Commands.Receiver;
import Models.Network;
import Models.User;

import java.util.Scanner;

public class Autorization implements Command{
    private final Receiver receiver;

    public Autorization(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Invoker invoker = new Invoker();
        Network network = receiver.getNetwork();
        Scanner scanner = new Scanner(System.in);
        String login, password;
        System.out.print("Enter login: ");       login = scanner.nextLine();
        System.out.print("Enter password: ");  password = scanner.nextLine();
        if(network.validationUser(login, password))
        {
            User currentUser = new User();
            currentUser.setLogin(login);
            currentUser.setPassword(password);
            network.setCurrentUser(currentUser);
            System.out.println("Welcome "+ network.getCurrentUser().getLogin() + " to the network");
        }
    }
}
