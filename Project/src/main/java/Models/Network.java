package Models;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private final List<User> userList = new ArrayList<User>();
    private User currentUser;
    private List<Massage> publicMassage = new ArrayList<Massage>();
    private List<Massage> privateMassage = new ArrayList<Massage>();

    public void addUserList(User user){
        this.userList.add(user);
    }
    public List<User> getUserList(){
        return this.userList;
    }

    public User getFriend(String name)
    {
        if(currentUser.getFriends().size()!=0)
        {
            for(int i=0;i<currentUser.getFriends().size();i++)
            {
                if(currentUser.getFriends().get(i).getLogin().equals(name)) {
                    System.out.println("Success");
                    return currentUser.getFriends().get(i);
                }
            }
        }
        System.out.println("Failed");
        return null;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    public Integer getUserOfNumber(){
        return userList.size();
    }

    public List<Massage> getPrivateMassage(){
        return this.privateMassage;
    }
    public void setPrivateMassage(Massage privateMassage){
        this.privateMassage.add(privateMassage);
    }
    public List<Massage> getPublicMassage(){
        return this.publicMassage;
    }
    public void setPublicMassage(Massage publicMassage){
        this.publicMassage.add(publicMassage);
    }

    public boolean validationUser(String login, String password){
        if(userList.size()!=0)
            for(int i=0;i<userList.size();i++)
            {
                if( (userList.get(i).getLogin().equals(login)) && (userList.get(i).getPassword().equals(password)) ) {
                    System.out.println("Validation success");
                    return true;
                }
            }
        System.out.println("Validation failed");
        return false;
    }

    public boolean validationUser(String user){
        if(userList.size()!=0)
            for(int i=0;i<userList.size();i++)
            {
                if(userList.get(i).getLogin().equals(user))
                    return false;
                else
                    return true;
            }
        return true;
    }

    public boolean validationUser(){
        if(this.currentUser!=null) {
            System.out.println("success");
            return true;
        }
        System.out.println("failed");
        return false;
    }
    public void showPublicMassage(){
        if(publicMassage.size()!=0)
            for (int i = 0; i < publicMassage.size(); i++) {
                System.out.println(publicMassage.get(i).getSendMassageUser().getLogin() + ": "
                        + publicMassage.get(i).getPublicMassage());
            }
    }

    public void showPrivateMassage(){
        if(privateMassage.size()!=0)
            for(int i=0;i<privateMassage.size();i++){
                System.out.println(privateMassage.get(i).getSendMassageUser().getLogin() + ": "
                        + privateMassage.get(i).getPrivateMassage());
            }
    }

    public void showRegisteredUsers(){
        if(userList.size()!=0)
            for (int i = 0; i < userList.size(); i++) {
                System.out.println(i+1 + "  :  " + userList.get(i).getLogin());
            }
    }
    public void showFriendList(){
        if(currentUser.getFriends().size()!=0)
            for (int i = 0; i < currentUser.getFriends().size(); i++) {
                System.out.println(currentUser.getFriends().get(i).getLogin());
            }
    }
}
