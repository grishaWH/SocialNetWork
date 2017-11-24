package Commands.Implements;

import Commands.Command;
import Commands.Receiver;
import Models.Massage;
import Models.Network;

import java.util.Scanner;

public class SendPublicMassage implements Command {
    private final Receiver receiver;

    public SendPublicMassage(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Network network = receiver.getNetwork();
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.print("Enter public massage: ");
        text = scanner.nextLine();
        Massage mas = new Massage(network.getCurrentUser(), text);
        network.setPublicMassage(mas);
    }
}
