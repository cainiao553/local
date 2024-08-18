package dao.lmpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import dao.StuDao;
import dataSource.StuData;
import dataSource.UserData;
import entity.Course;
import entity.Student;
import entity.User;



public class StuDaolmpl implements StuDao {
	public static Student[] 学生信息=StuData.initStuData();
	public static User[] 用户信息=UserData.initStuData();
	public static  UserDaolmpl user=new UserDaolmpl();
	@Override
	public Student[] print_student() {
		// TODO 自动生成的方法存根
		return 学生信息;
	}

	@Override
	public Student 查询学生(String id) {
		// TODO 自动生成的方法存根
		
		for(Student student:学生信息) {
			if(student==null) {
				break;
			}
			if(student.get学号().equals(id)) {
				return student;
			}
		}
		return null;
	}


	
	@Override
	public void 修改(String id,Student student) {
		// TODO 自动生成的方法存根
		int i;
		for(i=0;学生信息[i]!=null;i++) {
			if(学生信息[i]==null) {
				break;
			}
			if(学生信息[i].get学号().equals(id)) {
				学生信息[i]=student;
			}
		}
		
	}

	@Override
	public void 删除(String id) {
		// TODO 自动生成的方法存根
		Student[] students=new Student[100];
		int i=0;
		for(Student stu:学生信息) {
			if(stu==null) {
				break;
			}
			if(stu.get学号().equals(id)) {
				continue;
			}
			students[i++]=stu;
		}
		学生信息=students;
	}

	@Override
	public Student[] random_print() {
		// TODO 自动生成的方法存根
		Random 随机数=new Random(System.currentTimeMillis());
		Student[] students=new Student[3];
		List<Integer> list= new ArrayList<Integer>();
		int i=0;
		int temp;
		while(list.size()!=3) {
			temp=随机数.nextInt(100);
			if(!list.contains(temp)&&学生信息[temp]!=null) {
				list.add(temp);
				students[i++]=学生信息[temp];
			}
		}
		return students;
	}

	
	@Override
	public void 增加(Student student) {
		// TODO 自动生成的方法存根
			int i=0;
			for(;学生信息[i]!=null;i++) {
				
			}
			学生信息[i]=student;
		
	}



	@Override
	public void 增加用户(User user) {
		// TODO 自动生成的方法存根
		int i;
		for(i=0;用户信息[i]!=null;i++) {
			
		}
		用户信息[i]=user;
		
	}

	

	@Override
	public boolean 查询用户(String id) {
		// TODO 自动生成的方法存根
		boolean flag=false;
		for(User user:用户信息) {
			if(user==null) {
				break;
			}
			if(user.getId().equals(id)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			return flag;
		}else {
			return flag;
		}
	}

	@Override
	public void 选课(Student student,Course cousrse) {
		// TODO 自动生成的方法存根
		int i;
		for(i=0;student.课程[i]!=null;i++) {
			
		}
		student.课程[i]=cousrse;
	}

	@Override
	public void 删课(Student student,String id) {
		// TODO 自动生成的方法存根
		int i;
		Course[] course_copy=new Course[10];
		for(i=0;student.课程[i]!=null;i++) {
			if(student.课程[i].getId().equals(id)) {
				continue;
			}
			course_copy[i]=student.课程[i];
		}
		student.课程=course_copy;
	}

	@Override
	public void 改课(Student student,String id,Course course) {
		// TODO 自动生成的方法存根
		int i;
		for(i=0;student.课程[i]!=null;i++) {
			if(student.课程[i].getId().equals(id)) {
				student.课程[i]=course;
				break;
			}
		}
	}

	@Override
	public Student 查课(String id,String id_c) {
		// TODO 自动生成的方法存根
		
		for(Student student:学生信息) {
			if(student==null) {
				break;
			}
			if(student.get学号().equals(id)) {
				for(Course course:student.课程) {
					if(course==null) {
						break;
					}
					if(course.getId().equals(id_c)) {
						
						return student;
					}
				}
				break;
			}
		}
		return null;
	}

	@Override
	public void writerUserData() {
		// TODO 自动生成的方法存根
		File file=new File(".\\src\\UserData.txt");
		try {
			FileOutputStream fo=new FileOutputStream(file);
			OutputStreamWriter os=new OutputStreamWriter(fo);
			BufferedWriter bw=new BufferedWriter(os);
			for(User user:用户信息) {
				if(user==null) {
					break;
				}
				bw.append(user.getId()+" "+user.getPassword()+"\n");
			}
			bw.close();
			os.close();
			fo.close();
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	@Override
	public void writerStuData() {
		// TODO 自动生成的方法存根
		File file=new File(".\\src\\StudentData.txt");
		try {
			FileOutputStream fo=new FileOutputStream(file);
			OutputStreamWriter os=new OutputStreamWriter(fo);
			BufferedWriter bw=new BufferedWriter(os);
			for(Student stu:学生信息) {
				if(stu==null) {
					break;
				}
				bw.append(stu.get姓名()+" "+stu.get学号()+" "+stu.get性别()+" "+stu.get年龄()+" "+stu.get身高()+" "+stu.get体重()+" "+stu.get电话()+" "+stu.get籍贯()+" "+stu.get年级()+" "+stu.is毕业());
				for(Course cou:stu.课程) {
					if(cou==null) {
						break;
					}
					bw.append(" "+cou.getId()+" "+cou.getName());
				}
				bw.newLine();
			}
			bw.close();
			os.close();
			fo.close();
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}


 





}
