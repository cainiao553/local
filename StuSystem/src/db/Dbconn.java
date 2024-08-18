package db;

import java.sql.Connection;

import java.sql.DriverManager;
/*该数据库连接用于UserDaoImpl。 */
public class  Dbconn {
	public static Connection getConnection() throws Exception{
		String dburl = "jdbc:mysql://localhost:3306/school?useUnicode=true&&characterEncoding=UTF-8";
		String dbuser = "root" ;
		String dbpwd = "admin";
		Connection dbcon = null;
		Class.forName("com.mysql.jdbc.Driver");
		dbcon = DriverManager.getConnection(dburl, dbuser, dbpwd);
		return  dbcon;
	}
}
