package dataSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import entity.Course;
import entity.Student;
//学生
public class StuData {
	public static Student[] initStuData() {
		Student[] students = new Student[100];
		File file=new File(".\\src\\StudentData.txt");
		int i=0;
		String str;
		String[] strs;
		try {
			FileInputStream fi=new FileInputStream(file);
			InputStreamReader ir=new InputStreamReader(fi);
			BufferedReader br=new BufferedReader(ir);
			while((str=br.readLine())!=null) {
				strs=str.split(" ");
				
				students[i]=new Student(strs[0],strs[1], strs[2].charAt(0), Integer.parseInt(strs[3]), Float.parseFloat(strs[4]), Double.parseDouble(strs[5]), strs[6], strs[7], Integer.parseInt(strs[8]), Boolean.parseBoolean(strs[9]));
				if(strs.length>10) {
					for(int j=0;j+10<strs.length;j+=2) {
						students[i].课程[j]=new Course(strs[j+10], strs[j+11]);
					}
				}
				i++;
			}
			br.close();
			ir.close();
			fi.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return students;
	}

}
