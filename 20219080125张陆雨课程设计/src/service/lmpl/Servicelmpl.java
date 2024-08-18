package service.lmpl;

import java.util.Scanner;

import dao.lmpl.CouDaolmpl;
import dao.lmpl.StuDaolmpl;
import dao.lmpl.UserDaolmpl;
import entity.Course;
import entity.Student;
import entity.User;
import service.Service;

public class Servicelmpl implements Service{
	private static Scanner reader=new Scanner(System.in);
	private StuDaolmpl studentDao=new StuDaolmpl();
	private CouDaolmpl couDao=new CouDaolmpl();
	private UserDaolmpl user=new UserDaolmpl();
	@Override
	public Student[] print_student() {
		// TODO 自动生成的方法存根
		return studentDao.print_student();
	}

	@Override
	public boolean 修改(String id,Student student) {
		// TODO 自动生成的方法存根
		boolean flag;
		if(studentDao.查询学生(id)==null) {
			flag=false;
		}else {
			
			if(studentDao.查询学生(student.get学号())==null||student.get学号().equals(id)) {
				flag=true;
				studentDao.修改(id, student);
				studentDao.writerStuData();
			}else {
				flag=false;
			}
		}
		return flag;
	}

	@Override
	public boolean 删除(String id) {
		// TODO 自动生成的方法存根
		boolean flag;
		if(studentDao.查询学生(id)==null) {
			flag=false;
		}else {
			flag=true;
			studentDao.删除(id);
			studentDao.writerStuData();
		}
		return flag;
	}

	@Override
	public Student[] random_print() {
		// TODO 自动生成的方法存根
		int i=0;
		for(Student x:studentDao.print_student()) {
			if(x==null) {
				break;
			}
			i++;
		}
		if(i<3) {
			return studentDao.print_student();
		}else {
			return studentDao.random_print();
		}

	}

	@Override
	public boolean 增加(Student student) {
		// TODO 自动生成的方法存根
		boolean flag;
		Student stu=studentDao.查询学生(student.get学号());
		if(stu==null) {
			studentDao.增加(student);
			studentDao.writerStuData();
			flag=true;
		}else {
			flag=false;
		}
		return flag;
		
	}



	@Override
	public boolean 选课(String id,Course course) {
		// TODO 自动生成的方法存根
		return couDao.选课(id, course);
	}

	@Override
	public boolean 删课(String id,String id_c) {
		// TODO 自动生成的方法存根
		return couDao.删课(id, id_c);
	}

	@Override
	public boolean 改课(String id,String id_c,Course course) {
		// TODO 自动生成的方法存根
		return couDao.改课(id, id_c, course);
	}


	@Override
	public boolean 增加用户(User user) {
		// TODO 自动生成的方法存根
		return this.user.增加用户(user);
	}


	@Override
	public boolean 查询学生(String id) {
		// TODO 自动生成的方法存根
		boolean flag;
		if(studentDao.查询学生(id)!=null) {
			flag=true;
		}else {
			flag=false;
		}
		return flag;
	}


	

}
