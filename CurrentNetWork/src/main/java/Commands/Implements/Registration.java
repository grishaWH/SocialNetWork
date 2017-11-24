package Commands.Implements;

import Commands.Command;
import Commands.Receiver;
import Models.Network;
import Models.User;

import java.util.Scanner;

public class Registration implements Command {
    private final Receiver receiver;

    public Registration(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Network network = receiver.getNetwork();
        Scanner scanner = new Scanner(System.in);
        String login, password;
        System.out.print("Enter login: ");
        login = scanner.nextLine();
        if(network.validationLogin(login)) {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            network.addUserList(new User(network.getUserList().size() + 1, login, password));
            System.out.println("Registration success. Your ID: " + network.getUserList().size() +
                    ", Login: " + login + ", password: " + password);
        } else
            System.out.println("Login isn't unique");
    }
}
