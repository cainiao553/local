package dao.lmpl;

import dao.UserDao;
import entity.User;

public class UserDaolmpl implements UserDao {
	public static StuDaolmpl stuDao=new StuDaolmpl();
	@Override
	public boolean 增加用户(User user) {
		// TODO 自动生成的方法存根
		boolean flag;
		if(stuDao.查询用户(user.getId())) {
			flag=false;
		}else {
			stuDao.增加用户(user);
			stuDao.writerUserData();
			flag=true;
		}
		return flag;

	}

	
	
	@Override
	public boolean 查询用户(String id) {
		// TODO 自动生成的方法存根
		boolean flag;
		if(stuDao.查询用户(id)) {
			flag=true;
		}else {
			flag=false;
		}
		return flag;
	}
	

}
