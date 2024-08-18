package daoImpl;

import db.Dbconn;

import entity.Student;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    
    	public User findUserByUsernameAndPassword(String username, String password) {
    		// TODO Auto-generated method stub
    		try {
    			Connection con = Dbconn.getConnection();
    			Statement stmt = con.createStatement();
    			String sql1 = "select * from user where username=? and password = ?";
    			PreparedStatement pst = con.prepareStatement(sql1);
    			pst.setString(1, username);
    			pst.setString(2, password);
    			ResultSet rs1 = pst.executeQuery();
    			while(rs1.next()){

    				return new User(rs1.getString(1),rs1.getString(2));}
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} 
    		return null;

    	}
        
    

    public int add(User user) {
		// TODO Auto-generated method stub
		try {
			
			Connection con = Dbconn.getConnection();
			String sql1 = "INSERT INTO user values(null,?,?)";
			PreparedStatement pst = con.prepareStatement(sql1);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			//ResultSet rs1 = stmt.executeQuery(sql1);
			
				return pst.executeUpdate();	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return 0;
	}
}
