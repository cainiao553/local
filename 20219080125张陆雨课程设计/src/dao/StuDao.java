package dao;

import entity.Course;
import entity.Student;
import entity.User;

public interface StuDao {
	public Student[] print_student();//输出所有学生
	public Student  查询学生(String id); //判断学生存在
	public void 修改(String id,Student student) ;//修改学生信息
	public void 删除(String id);//删除学生信息
	public Student[] random_print();//随机输出三个学生
	public void 增加(Student student) ;//添加学生信息
	public void 增加用户(User user);//增加用户信息
	public boolean 查询用户(String id);//查看已有的课程
	public void 选课(Student student,Course course);//增添课程
	public void 删课(Student student,String id);//删除课程
	public void 改课(Student student,String id,Course course);//修改课程
	public Student 查课(String id,String id_c);//查看已有的课程
	public void writerStuData();
	public void writerUserData();
}
