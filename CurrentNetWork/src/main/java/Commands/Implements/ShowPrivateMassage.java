package Commands.Implements;

import Commands.Command;
import Commands.Receiver;
import Models.Network;

public class ShowPrivateMassage implements Command{
    private final Receiver receiver;

    public ShowPrivateMassage(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        Network network = receiver.getNetwork();
        if(network.getCurrentUser().getPrivateMassage().size()!=0)
        {
            for(int i = 0; i < network.getCurrentUser().getPrivateMassage().size(); i++)
            {
                if(network.getCurrentUser().getLogin().
                        equals(network.getCurrentUser().getPrivateMassage().get(i).getSenderUserMassage().getLogin()))
                    System.out.println("User " + network.getCurrentUser().getLogin() +
                            " send massage for "+ network.getCurrentUser().
                            getPrivateMassage().get(i).getReceiverUserMassage().getLogin() +": "+
                            network.getCurrentUser().getPrivateMassage().get(i).getText());
                else
                    System.out.println("User " + network.getCurrentUser().getPrivateMassage().get(i).getReceiverUserMassage()
                            .getLogin() + "Received massage from "+ network.getCurrentUser().
                            getPrivateMassage().get(i).getSenderUserMassage().getLogin()+ " :" +
                            network.getCurrentUser().getPrivateMassage().get(i).getText());
            }
        }
    }
}
