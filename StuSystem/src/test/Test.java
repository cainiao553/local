package test;

import daoImpl.StudentDaoImpl;
import daoImpl.UserDaoImpl;
import entity.Student;
import entity.User;

public class Test {
    public static void main(String[] args) {
        UserDaoImpl impl=new UserDaoImpl();
        User zhangsan = impl.findUserByUsernameAndPassword("zhangsan", "123456");
        System.out.println(zhangsan);
    }
}
