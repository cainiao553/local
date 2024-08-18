package dao;

import entity.User;

public interface UserDao {
    User findUserByUsernameAndPassword(String username, String password);
    int add(User user);
}
