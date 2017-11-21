package Commands.Implements;

import Commands.Command;
import Commands.Receiver;
import Models.Network;

public class ShowFriendList implements Command {
    private final Receiver receiver;

    public ShowFriendList(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Network network = receiver.getNetwork();
        if(network.validationUser()){
            network.showFriendList();
        }
    }
}
