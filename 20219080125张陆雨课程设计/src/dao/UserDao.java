package dao;

import entity.User;

public interface UserDao {
	public boolean 增加用户(User user);//增加用户信息
	public boolean 查询用户(String id);//查看已有的课程
}
