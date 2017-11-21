package Models;

public class Massage {
    private User sendMassageUser;
    private User acceptMassageUser;
    private String publicMassage;
    private String privateMassage;

    public Massage(User sendMassageUser, User acceptMassageUser, String privateMassage)
    {
        this.sendMassageUser = sendMassageUser;
        this.acceptMassageUser = acceptMassageUser;
        this.privateMassage=privateMassage;
    }
    public Massage(User sendMassageUser, String publicMassage)
    {
        this.sendMassageUser = sendMassageUser;
        this.publicMassage = publicMassage;
    }

    public User getSendMassageUser() {
        return sendMassageUser;
    }

    public User getAcceptMassageUser() {
        return acceptMassageUser;
    }

    public String getPublicMassage() {
        return publicMassage;
    }

    public String getPrivateMassage() {
        return privateMassage;
    }
}
