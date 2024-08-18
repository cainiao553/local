package serviceImpl;

import dao.StudentDao;
import daoImpl.StudentDaoImpl;
import entity.PageBean;
import entity.Student;
import service.StudentService;

import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {
    private StudentDao dao = new StudentDaoImpl();

    @Override
    public List<Student> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }

   // @Override
    //public Student login(Student student) {
       // return dao.findUserByUsernameAndPassword(student.getUsername(), student.getPassword());
    //}

    @Override
    public void addUser(Student student) {
        dao.add(student);
    }

    @Override
    public void deleteUser(String id) {
        dao.delete(Integer.parseInt(id));
    }

    @Override
    public Student findUserById(String id) {
        return dao.findById(Integer.parseInt(id));
    }

    @Override
    public void updateUser(Student student) {
        dao.update(student);
    }

    @Override
    public void delSelectedUser(String[] ids) {
        if(ids != null && ids.length > 0){
            //1.遍历数组
            for (String id : ids) {
                //2.调用dao删除
                dao.delete(Integer.parseInt(id));
            }
        }

    }

    @Override
    public PageBean<Student> findUserByPage() {

       
        
        //1.创建空的PageBean对象
        PageBean<Student> pb = new PageBean<Student>();
        //2.设置参数
     
        //3.调用dao查询总记录数
        int totalCount = dao.findTotalCount();
        pb.setTotalCount(totalCount);
        //4.调用dao查询List集合
        //计算开始的记录索引
        
        List<Student> list = dao.findByPage();
        pb.setList(list);



        return pb;
    }

	
	public PageBean<Student> findStudent(String a1,String a2,String a3) {
		// TODO Auto-generated method stub
		PageBean<Student> pb = new PageBean<Student>();
		List<Student> list = dao.findStudent(a1, a2, a3);
		pb.setList(list);
		
		return pb;
	}
}
