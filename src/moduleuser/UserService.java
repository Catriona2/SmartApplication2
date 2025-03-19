package moduleuser;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();
    public void addUser(String name, int age) {
        users.add(new User(name, age));
    }
    public List<User> getUsers() {
        return users;
    }
}
