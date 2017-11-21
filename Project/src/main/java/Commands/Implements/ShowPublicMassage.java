package Commands.Implements;

import Commands.Command;
import Commands.Receiver;
import Models.Network;

import java.util.Scanner;

public class ShowPublicMassage implements Command {
    private final Receiver receiver;

    public ShowPublicMassage(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        Network network = receiver.getNetwork();
        if(network.validationUser())
            network.showPublicMassage();
    }
}
