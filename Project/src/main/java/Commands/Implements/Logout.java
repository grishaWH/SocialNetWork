package Commands.Implements;

import Commands.Command;
import Commands.Receiver;
import Models.Network;

public class Logout implements Command {
    private final Receiver receiver;

    public Logout(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Network network = receiver.getNetwork();
        if(network.validationUser())
            network.setCurrentUser(null);
    }
}
