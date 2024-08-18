package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entity.User;
import service.lmpl.Servicelmpl;

public class delCourse extends JFrame implements ActionListener {
	private static Servicelmpl service=new Servicelmpl();
	private JFrame jframe;
	private JLabel idl;
	private JTextField idt;
	private JLabel id_cl;
	private JTextField id_ct;
	private JButton button;
	private JLabel tishi1;
	private JLabel tishi2;
	private JLabel tishi3;
	public delCourse() {
		// TODO 自动生成的构造函数存根
		jframe=new JFrame("删除课程");
		jframe.setSize(600, 600);
		jframe.setLayout(null);
		
		idl=new JLabel("学生学号:");
		idl.setSize(60, 30);
		idl.setLocation(150, 150);
		jframe.add(idl);
		
		idt=new JTextField();
		idt.setSize(200,35);
		idt.setLocation(210, 150);
		jframe.add(idt);
		
		tishi1=new JLabel();
		tishi1.setSize(200, 30);
		tishi1.setLocation(420, 150);
		jframe.add(tishi1);
		
		id_cl=new JLabel("课程代码:");
		id_cl.setSize(60, 30);
		id_cl.setLocation(150, 200);
		jframe.add(id_cl);
		
		id_ct=new JTextField();
		id_ct.setSize(200,35);
		id_ct.setLocation(210, 200);
		jframe.add(id_ct);
		
		tishi2=new JLabel();
		tishi2.setSize(100, 30);
		tishi2.setLocation(420, 200);
		jframe.add(tishi2);
		
		button=new JButton("删除");
		button.setSize(60, 30);
		button.setLocation(230, 280);
		jframe.add(button);
		button.addActionListener(this);
		
		tishi3=new JLabel();
		tishi3.setSize(100, 30);
		tishi3.setLocation(300, 280);
		jframe.add(tishi3);
		
		
		jframe.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		tishi3.setText("");
		boolean flag=true;
		if(idt.getText().equals("")) {
			tishi1.setText("不能为空");
			flag=false;
		}else {
			tishi1.setText("");
		}
		if(id_ct.getText().equals("")) {
			tishi2.setText("不能为空");
		}else {
			tishi2.setText("");
		}
		if(flag) {
			if(service.删课(idt.getText(),id_ct.getText())) {
				tishi3.setText("删除成功");
				id_ct.setText("");
			}else {
				tishi1.setText("学生不存在或未选择该课");
				
			}
		}
	}

}
