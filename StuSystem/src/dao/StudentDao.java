package dao;

import java.util.List;
import java.util.Map;

import entity.Student;

/**
 * 用户操作的DAO
 */
public interface StudentDao {


    public List<Student> findAll();
    public List<Student> findStudent(String a1,String a2,String a3);
    //Student findUserByUsernameAndPassword(String username, String password);

    void add(Student student);

    void delete(int id);

    Student findById(int i);

    void update(Student student);

    /**
     * 查询总记录数
     * @return
     * @param condition
     */
    int findTotalCount();

    /**
     * 分页查询每页记录
     * @param start
     * @param rows
     * @param condition
     * @return
     */
    List<Student> findByPage();
}
