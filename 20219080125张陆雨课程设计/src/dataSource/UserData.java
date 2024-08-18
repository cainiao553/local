package dataSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import entity.User;
//管理员
public class UserData {
	public static User[] initStuData() {
		User[] users=new User[100];
		int i=0;
		File file=new File(".\\src\\UserData.txt");
		String str;
		String[] strs;
		try {
			FileInputStream fi=new FileInputStream(file);
			InputStreamReader ir=new InputStreamReader(fi);
			BufferedReader br=new BufferedReader(ir);
			while((str=br.readLine())!=null) {
				strs=str.split(" ");
				users[i++]=new User(strs[0], strs[1]);
			}
			br.close();
			ir.close();
			fi.close();
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		return users;
		
	}
}
