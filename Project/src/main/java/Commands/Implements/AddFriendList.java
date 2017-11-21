package Commands.Implements;

import Commands.Command;
import Commands.Receiver;
import Models.Network;

import java.util.Scanner;

public class AddFriendList implements Command {
    private final Receiver receiver;

    public AddFriendList(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Network network = receiver.getNetwork();
        Scanner scanner = new Scanner(System.in);
        if(network.validationUser()) {
            System.out.println("Enter his name: ");
            String friend = scanner.nextLine();
            if(network.validationUser(friend))
                network.getCurrentUser().setFriends(network.getFriend(friend));
        }

    }
}
