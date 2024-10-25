package springMVC_Hibernate.dao;

import springMVC_Hibernate.model.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    List<User> getUsers();
    User getUserById(int id);
    void deleteUserById(int id);
}
