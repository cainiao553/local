package dao.lmpl;

import dao.CouDao;
import entity.Course;
import entity.Student;

public class CouDaolmpl implements CouDao {
	private StuDaolmpl studentDao=new StuDaolmpl();
	@Override
	public boolean 选课(String id, Course course) {
		// TODO 自动生成的方法存根
		boolean flag;
		if(studentDao.查询学生(id)!=null) {
			Student student=studentDao.查课(id, course.getId());
			if(student!=null) {
				flag=false;
			}else {
				studentDao.选课(studentDao.查询学生(id), course);
				studentDao.writerStuData();
				flag=true;
			}
			
		}else {
			flag=false;
		}
		return flag;
	}
	@Override
	public boolean 删课(String id, String id_c) {
		// TODO 自动生成的方法存根
		boolean flag;
		if(studentDao.查询学生(id)!=null) {
			Student student=studentDao.查课(id, id_c);
			if(student!=null) {
				studentDao.删课(student, id_c);
				studentDao.writerStuData();
				flag=true;
			}else {
				flag=false;
			}
			
		}else {
			flag=false;
		}
		return flag;
	}
	@Override
	public boolean 改课(String id,String id_c,Course course) {
		// TODO 自动生成的方法存根
		boolean flag;
		if(studentDao.查询学生(id)!=null) {
			Student student=studentDao.查课(id, id_c);
			Student student2=studentDao.查课(id, course.getId());
			if(student!=null&&(student2==null || course.getId().equals(id_c))) {
				studentDao.改课(student, id_c,course);
				studentDao.writerStuData();
				flag=true;
			}else {
				flag=false;
			}
			
		}else {
			flag=false;
		}
		return flag;
	}
	@Override
	public boolean 查课(String id, String id_c) {
		// TODO 自动生成的方法存根
		boolean flag;
		if(studentDao.查询学生(id)!=null) {
			if(studentDao.查课(id, id_c)!=null) {
				flag=true;
			}else {
				flag=false;
			}
			
		}else {
			flag=false;
		}
		return flag;
	}

	


		
}
