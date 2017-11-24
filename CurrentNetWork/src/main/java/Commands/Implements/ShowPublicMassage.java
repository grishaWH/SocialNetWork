package Commands.Implements;

import Commands.Command;
import Commands.Receiver;
import Models.Network;

public class ShowPublicMassage implements Command {
    private final Receiver receiver;

    public ShowPublicMassage(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Network network = receiver.getNetwork();
        if(network.getPublicMassage().size()!=0)
        {
            for(int i = 0; i < network.getPublicMassage().size(); i++){
                System.out.println("User " + network.getPublicMassage().get(i).getSenderUserMassage().getLogin() +
                    " send massage: " + network.getPublicMassage().get(i).getText());
            }
        }
    }
}
