package daoImpl;

import db.Dbconn;


import entity.Student;
import entity.User;


import dao.StudentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentDaoImpl implements StudentDao {



   
    
    public List<Student> findAll() {
		// TODO Auto-generated method stub
		String sql ="select * from student";
		List<Student> stu = new ArrayList<Student>();
		Connection con;
		try {
			con = Dbconn.getConnection();
			Statement  stmt = con.createStatement();
			ResultSet rs1 = stmt.executeQuery(sql);
			while(rs1.next())
			{
				stu.add(new Student(rs1.getInt(1),rs1.getString(2),rs1.getString(3), rs1.getInt(4), rs1.getString(5), rs1.getString(6),rs1.getString(7)));
			}
			return stu;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("方法错误，请重试");
		return null;
	}

    @Override
    public void add(Student student) {
		Connection con;
		try {
			con = Dbconn.getConnection();
			// 1.定义sql
			String sql = "insert into student values(?,?,?,?,?,?,?)";
			// 2.执行sql
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, student.getId());
			pst.setString(2, student.getName());
			pst.setString(3, student.getGender());
			pst.setInt(4, student.getAge());
			pst.setString(5, student.getAddress());
			pst.setString(6, student.getQq());
			pst.setString(7, student.getEmail());
			pst.executeUpdate();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

    @Override
	public void delete(int id) {
		try {
			Connection con=Dbconn.getConnection();
			// 1.定义sql
			String sql = "delete from student where id = ?";
			// 2.执行sql
			PreparedStatement pr=con.prepareStatement(sql);
			pr.setInt(1, id);
			pr.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

    @Override
	public Student findById(int id) {
		try {
			Connection con=Dbconn.getConnection();
			String sql = "select * from student where id = ?";
			PreparedStatement pr=con.prepareStatement(sql);
			pr.setInt(1, id);
			ResultSet rs=pr.executeQuery();
			while(rs.next())
			{
				int i=rs.getInt(1);
				String name=rs.getString(2);
				String gender=rs.getString(3);
				int j=rs.getInt(4);
				String address=rs.getString(5);
				String qq=rs.getString(6);
				String email=rs.getString(7);
				return new Student(i,name,gender,j,address,qq,email);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

    @Override
	public void update(Student student) {
		try {
			Connection con=Dbconn.getConnection();
			String sql = "update student set name = ?,gender = ? ,age = ? , address = ? , qq = ?, email = ? where id = ?";
			PreparedStatement pr=con.prepareStatement(sql);
			pr.setString(1, student.getName());
			pr.setString(2, student.getGender());
			pr.setInt(3, student.getAge());
			pr.setString(4, student.getAddress());
			pr.setString(5, student.getQq());
			pr.setString(6, student.getEmail());
			pr.setInt(7, student.getId());
			pr.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    //改成查询所有的数据。
    @Override
    public int findTotalCount() {
    	try {
			Connection con = Dbconn.getConnection();
			Statement stmt = con.createStatement();
			String sql1 = "select count(*) from user where 1 = 1";
			PreparedStatement pst = con.prepareStatement(sql1);
			ResultSet rs1 = pst.executeQuery();
			return pst.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return 0;
    }
    
    /*public int findcount() {
		// TODO Auto-generated method stub
		try {
			Connection con = Dbconn.getConnection();
			Statement stmt = con.createStatement();
			String sql1 = "select count(*) from user where 1 = 1";
			PreparedStatement pst = con.prepareStatement(sql1);
			ResultSet rs1 = pst.executeQuery();
			return pst.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return 0;
	}*/
    
   //改成查询所有的数据。
    @Override
    /*public List<Student> findByPage(int start, int rows, Map<String, String[]> condition) {
        String sql = "select * from student  where 1 = 1 ";

        StringBuilder sb = new StringBuilder(sql);
        //2.遍历map
        Set<String> keySet = condition.keySet();
        //定义参数的集合
        List<Object> params = new ArrayList<Object>();
        for (String key : keySet) {

            //排除分页条件参数
            if("currentPage".equals(key) || "rows".equals(key)){
                continue;
            }

            //获取value
            String value = condition.get(key)[0];
            //判断value是否有值
            if(value != null && !"".equals(value)){
                //有值
                sb.append(" and "+key+" like ? ");
                params.add("%"+value+"%");//？条件的值
            }
        }

        //添加分页查询
        sb.append(" limit ?,? ");
        //添加分页查询参数值
        params.add(start);
        params.add(rows);
        sql = sb.toString();
        System.out.println(sql);
        System.out.println(params);

        return template.query(sql,new BeanPropertyRowMapper<Student>(Student.class),params.toArray());
        
    }*/
    
    public List<Student> findByPage() {
		// TODO Auto-generated method stub
		try {
			Connection con = Dbconn.getConnection();
			Statement stmt = con.createStatement();
			String sql1 = "select * from student  where 1 = 1";
			List<Student> stu = new ArrayList<Student>();
			PreparedStatement pst = con.prepareStatement(sql1);
			ResultSet rs1 = pst.executeQuery();
			while(rs1.next()){

				stu.add(new Student(rs1.getInt(1),rs1.getString(2),rs1.getString(3), rs1.getInt(4), rs1.getString(5), rs1.getString(6),rs1.getString(7)));
			}
			return stu; 
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;

	}


	@Override
	public List<Student> findStudent(String a1,String a2,String a3) {
		// TODO Auto-generated method stub
		try {
			Connection con = Dbconn.getConnection();
			Statement stmt = con.createStatement();
			String sql1 = "select * from student where name=? and address = ? and email = ?";
			PreparedStatement pst = con.prepareStatement(sql1);
			List<Student> stu = new ArrayList<Student>();
			pst.setString(1,a1);
			pst.setString(2,a2);
			pst.setString(3,a3);
			ResultSet rs1 = pst.executeQuery();
			while(rs1.next()){

				stu.add(new Student(rs1.getInt(1),rs1.getString(2),rs1.getString(3), rs1.getInt(4), rs1.getString(5), rs1.getString(6),rs1.getString(7)));}
			System.out.println("这是stu里的信息"+stu.toString());
			return stu;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;


	}


    
}
