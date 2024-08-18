package serviceImpl;

import dao.UserDao;
import daoImpl.UserDaoImpl;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao dao=new UserDaoImpl();
    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public void addUser(User user) {
         dao.add(user);
    }
}
