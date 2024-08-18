package dao;

import entity.Course;

public interface CouDao {
	public boolean 选课(String id,Course course);//增添课程
	public boolean 删课(String id,String id_c);//删除课程
	public boolean 改课(String id,String id_c,Course course);//修改课程
	public boolean 查课(String id,String id_c);//查看已有的课程
}
