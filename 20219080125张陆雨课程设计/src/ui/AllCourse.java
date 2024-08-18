package ui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import entity.Course;
import entity.Student;
import service.lmpl.Servicelmpl;


public class AllCourse extends JFrame {
	private static Servicelmpl service=new Servicelmpl();
	private JFrame jframe;
	private JTextArea jtArea;
	private JPanel panel;
	private JScrollPane pane;
	private JButton button;
	public AllCourse() {
		
		jframe=new JFrame("课程信息");
		jframe.setSize(600, 600);
		jframe.setLayout(null);
		
		jtArea=new JTextArea();
		jtArea.setSize(600, 500);
		jframe.add(jtArea);
		
		panel=new JPanel();
		panel.setBounds(0, 0, 600, 500);
		panel.setLayout(new BorderLayout());
		panel.add(jtArea);
		
		pane=new JScrollPane();
		pane.setBounds(0,0,600,500);
		pane.getViewport().add(panel);
		jframe.add(pane);
		
		for(Student student:service.print_student()) {
			if(student==null) {
				break;
			}
			if(student.课程[0]==null) {
				jtArea.append(student.get姓名()+" 未选课\r\n");
			}else {
				jtArea.append(student.get姓名()+" 选课情况\n");
				for(Course cou:student.课程) {
					if(cou==null) {
						break;
					}
					jtArea.append(cou.toString()+"\r\n");
				}
			}
		}
		
		
		jframe.setVisible(true);
	}

}
