package Commands.Implements;

import Commands.Command;
import Commands.Receiver;
import Models.Network;

import java.util.Scanner;

public class AddFriend implements Command {
    private final Receiver receiver;

    public AddFriend(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Network network = receiver.getNetwork();
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Enter name friend: ");
        name = scanner.nextLine();
        if(!network.getCurrentUser().getLogin().equals(name))
            if(network.getCurrentUser().validateFriend(name)) {
                network.getCurrentUser().addFriend(network.getUser(name));
                network.getUser(name).addFriend(network.getCurrentUser());
            }
            else
                System.out.println("User doesn't exist");
        else
            System.out.println("You can not add yourself as a friend");

    }

}
