package service;

import entity.User;

public interface UserService {
    /**
     * 登录方法
     * @param user
     * @return
     */
    User login(User user);
    /**
     * 保存User
     *
     */
    void addUser(User user);
}
