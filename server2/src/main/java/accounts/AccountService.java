package accounts;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private final Map<String,String> users;

    public AccountService() {
        users = new HashMap<>();
    }

    public Map<String, String> getUsers() {
        return users;
    }

    public void addNewUser(UserProfile userProfile){
        users.put(userProfile.getLogin(),userProfile.getPassword());
    }

    public String getLogin(String login){
        return users.get(login);
    }

    public boolean hasUser(String login){
        return users.get(login) != null;
    }
}
