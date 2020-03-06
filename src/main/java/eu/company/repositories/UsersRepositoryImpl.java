package eu.company.repositories;

import eu.company.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryImpl implements UsersRepository {

    private List<User> users;

    public UsersRepositoryImpl() {
        this.users = new ArrayList<>();
        User user = new User("Artem", "qwerty007", LocalDate.parse("1996-02-02"));
        User user1 = new User("Artem1", "qwerty007", LocalDate.parse("1996-02-02"));
        User user2 = new User("Artem1", "qwerty007", LocalDate.parse("1996-02-02"));
        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    public List<User> findAll() {
        return this.users;
    }

}

