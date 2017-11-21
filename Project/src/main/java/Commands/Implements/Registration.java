package Commands.Implements;

import Commands.Command;
import Commands.Invoker;
import Commands.Receiver;
import Models.Network;
import Models.User;

import java.util.Scanner;

public class Registration implements Command{
    private final Receiver receiver;

    public Registration(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Invoker invoker = new Invoker();
        Scanner scanner = new Scanner(System.in);
        String login, password;
        System.out.print("Enter the login: "); login = scanner.nextLine();
        User newUser = new User();
        Network network = receiver.getNetwork();
        if(network.validationUser(login))
        {
            System.out.print("Enter the password: "); password = scanner.nextLine();
            newUser.setLogin(login);
            newUser.setPassword(password);
            network.addUserList(newUser);
            System.out.println("Your account is registered and have number of the network "+network.getUserList().size());
            System.out.println("Data to enter the network:");
            System.out.println("Login: "+ login + " and Password: " + password);
        }
        else
            System.out.println("User exist on the network!");
    }
}
