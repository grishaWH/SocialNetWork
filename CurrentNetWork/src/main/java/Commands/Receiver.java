package Commands;
import Models.Network;

public class Receiver {
    private final Network network;
    public Receiver(Network network){
        this.network = network;
    }

    public Network getNetwork(){
        return network;
    }
}
