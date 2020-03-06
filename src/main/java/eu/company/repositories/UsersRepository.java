package eu.company.repositories;

import eu.company.models.User;

import java.util.List;

public interface UsersRepository {
     List<User> findAll();
}
