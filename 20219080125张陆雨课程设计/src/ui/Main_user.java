package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main_user extends JFrame implements ActionListener {

	private JFrame jframe;
	private JMenu jmenu1;
	private JMenu jmenu2;
	private JMenu jmenu3;
	private JMenuBar jmenubar;
	private JMenuItem jmItem1;
	private JMenuItem jmItem2;
	private JMenuItem jmItem3;
	private JMenuItem jmItem4;
	private JMenuItem jmItem5;
	private JMenuItem jmItem7;
	private JMenuItem jmItem9;
	private JMenuItem jmItem13;
	private JMenuItem jmItem14;
	private JMenuItem jmItem15;
	public Main_user() {
		
		jframe=new JFrame("主窗口（管理员模式）");
		jframe.setSize(600, 600);
		jframe.setLayout(null);
		
		jmenubar=new JMenuBar();
		jframe.setJMenuBar(jmenubar);
		
		jmenu1=new JMenu("查看菜单");
		jmenubar.add(jmenu1);
		
		jmenu2=new JMenu("操作菜单");
		jmenubar.add(jmenu2);
		
		jmItem1=new JMenuItem("查看所有同学");
		jmItem2=new JMenuItem("随机同学信息");
		jmItem7=new JMenuItem("课程信息");
		jmenu1.add(jmItem1);
		jmenu1.add(jmItem2);
		jmenu1.add(jmItem7);
		
		jmItem3=new JMenuItem("添加学生信息");
		jmItem4=new JMenuItem("修改学生信息");
		jmItem5=new JMenuItem("删除学生信息");
		jmItem13=new JMenuItem("添加课程");
		jmItem14=new JMenuItem("修改课程");
		jmItem15=new JMenuItem("删除课程");
		jmenu2.add(jmItem3);
		jmenu2.add(jmItem4);
		jmenu2.add(jmItem5);
		jmenu2.add(jmItem13);
		jmenu2.add(jmItem14);
		jmenu2.add(jmItem15);
		
		jmenu3=new JMenu("系统菜单");
		jmItem9=new JMenuItem("退出");
		jmenu3.add(jmItem9);
		jmenubar.add(jmenu3);
		
		
		jmItem1.addActionListener(this);
		jmItem2.addActionListener(this);
		jmItem3.addActionListener(this);
		jmItem4.addActionListener(this);
		jmItem5.addActionListener(this);
		jmItem7.addActionListener(this);
		jmItem9.addActionListener(this);
		jmItem13.addActionListener(this);
		jmItem14.addActionListener(this);
		jmItem15.addActionListener(this);
		
		jframe.setVisible(true);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		JMenuItem ji=(JMenuItem)e.getSource();
		String str=ji.getText();
		if(str.equals("查看所有同学")) {
			new All();
		}else if(str.equals("随机同学信息")) {
			new ran();
		}else if(str.equals("添加学生信息")) {
			new addStu();
		}else if(str.equals("修改学生信息")) {
			new modifyStu();
		}else if(str.equals("删除学生信息")) {
			new delStu();
		}else if(str.equals("退出")) {
			System.exit(0);
		}else if(str.equals("课程信息")) {
			new AllCourse();
		}else if(str.equals("添加课程")) {
			new addCourse();
		}else if(str.equals("删除课程")) {
			new delCourse();
		}else if(str.equals("修改课程")){
			new modifyCourse();
		}
				
	}

	

}
