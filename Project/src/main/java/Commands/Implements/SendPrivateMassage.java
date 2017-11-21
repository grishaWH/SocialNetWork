package Commands.Implements;

import Commands.Command;
import Commands.Receiver;
import Models.Massage;
import Models.Network;

import java.util.Scanner;

public class SendPrivateMassage implements Command{
    private final Receiver receiver;

    public SendPrivateMassage(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Network network = receiver.getNetwork();
        Scanner scanner = new Scanner(System.in);
        String massage;
        if(network.validationUser())
        {
            System.out.print("Enter the name of the recipient: ");
            String name = scanner.nextLine();
            if(network.validationUser(name)){
                System.out.println("Enter the private massage text: ");
                String text = scanner.nextLine();
                Massage mas = new Massage(network.getCurrentUser(), network.getFriend(name), text);
                network.setPrivateMassage(mas);
            }
        }
    }
}
