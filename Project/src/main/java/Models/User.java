package Models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String login;
    private String password;
    private List<User> friends = new ArrayList<User>();

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getFriends() {
        return friends;
    }
    public void setFriends(User friends) {
        this.friends.add(friends);
    }
}
