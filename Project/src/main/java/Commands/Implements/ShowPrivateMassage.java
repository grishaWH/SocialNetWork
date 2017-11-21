package Commands.Implements;

import Commands.Command;
import Commands.Receiver;
import Models.Network;

public class ShowPrivateMassage implements Command {
    private final Receiver receiver;

    public ShowPrivateMassage(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Network network = receiver.getNetwork();
        if(network.validationUser())
            network.showPrivateMassage();
    }
}
