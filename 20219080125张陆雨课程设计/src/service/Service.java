package service;

import entity.Course;
import entity.Student;
import entity.User;

public interface Service {

	public Student[] print_student();//输出所有学生
	public boolean 修改(String id,Student student) ;//修改学生信息
	public boolean 删除(String id);//删除学生信息
	public Student[] random_print();//随机输出三个学生
	public boolean 查询学生(String id);//查询学生
	public boolean 增加(Student student) ;//添加学生信息
	public boolean 选课(String id,Course course);//增添课程
	public boolean 删课(String id,String id_c);//删除课程
	public boolean 改课(String id,String id_c,Course course);//修改课程
	public boolean 增加用户(User user);//增加用户信息
}
