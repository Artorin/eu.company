package eu.company.servises;

import eu.company.models.User;

import java.util.List;

public class UserService {

    List<User> users;
    User user;

    public List<User> findAllUsers() {
        return users;
    }

    public void saveUser(User user) {
    }

    public User findUser(int id) {
        return user;
    }

    public void updateUser(User user) {
    }

    public void deleteUser(User user) {
    }
}
