package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entity.Course;
import entity.User;
import service.lmpl.Servicelmpl;

public class modifyCourse extends JFrame implements ActionListener {
	private static Servicelmpl service=new Servicelmpl();
	private JFrame jframe;
	private JLabel id_cl;
	private JTextField id_ct;
	private JLabel name_cl;
	private JTextField name_ct;
	private JLabel idl;
	private JTextField idt;
	private JLabel idStul;
	private JTextField idStut;
	private JButton button;
	private JLabel tishi1;
	private JLabel tishi2;
	private JLabel tishi3;
	private JLabel tishi4;
	private JLabel tishi5;
	public modifyCourse() {
		// TODO 自动生成的构造函数存根
		jframe=new JFrame("修改课程");
		jframe.setSize(600, 600);
		jframe.setLayout(null);
		
		idStul=new JLabel("学生学号:");
		idStul.setSize(60, 30);
		idStul.setLocation(150, 50);
		jframe.add(idStul);
		
		idStut=new JTextField();
		idStut.setSize(200,35);
		idStut.setLocation(210, 50);
		jframe.add(idStut);
		
		tishi5=new JLabel();
		tishi5.setSize(100, 30);
		tishi5.setLocation(420, 50);
		jframe.add(tishi5);
		
		id_cl=new JLabel("课程代码:");
		id_cl.setSize(60, 30);
		id_cl.setLocation(150, 150);
		jframe.add(id_cl);
		
		id_ct=new JTextField();
		id_ct.setSize(200,35);
		id_ct.setLocation(210, 150);
		jframe.add(id_ct);
		
		tishi1=new JLabel();
		tishi1.setSize(100, 30);
		tishi1.setLocation(420, 150);
		jframe.add(tishi1);
		
		name_cl=new JLabel("课程名:");
		name_cl.setSize(60, 30);
		name_cl.setLocation(162, 200);
		jframe.add(name_cl);
		
		name_ct=new JTextField();
		name_ct.setSize(200,35);
		name_ct.setLocation(210, 200);
		jframe.add(name_ct);
		
		tishi2=new JLabel();
		tishi2.setSize(100, 30);
		tishi2.setLocation(420, 200);
		jframe.add(tishi2);
		
		button=new JButton("修改");
		button.setSize(60, 30);
		button.setLocation(230, 280);
		jframe.add(button);
		button.addActionListener(this);
		
		idl=new JLabel("原课程代码:");
		idl.setSize(80, 30);
		idl.setLocation(138, 100);
		jframe.add(idl);
		
		idt=new JTextField();
		idt.setSize(200,35);
		idt.setLocation(210, 100);
		jframe.add(idt);
		
		tishi4=new JLabel();
		tishi4.setSize(100, 30);
		tishi4.setLocation(420, 100);
		jframe.add(tishi4);
		
		tishi3=new JLabel();
		tishi3.setSize(300, 40);
		tishi3.setLocation(250, 350);
		jframe.add(tishi3);
		
		
		jframe.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		tishi3.setText("");
		boolean flag=true;
		if(idStut.getText().equals("")) {
			tishi5.setText("不能为空");
			flag=false;
		}else {
			tishi5.setText("");
		}
		if(idt.getText().equals("")) {
			tishi4.setText("不能为空");
			flag=false;
		}else {
			tishi4.setText("");
		}
		if(id_ct.getText().equals("")) {
			tishi1.setText("不能为空");
			flag=false;
		}else {
			tishi1.setText("");
		}
		if(name_ct.getText().equals("")) {
			tishi2.setText("不能为空");
			flag=false;
		}else {
			tishi2.setText("");
		}
		if(flag) {
			Course course=new Course(id_ct.getText(), name_ct.getText());
			if(service.改课(idStut.getText(),idt.getText(),course)) {
				tishi3.setText("修改成功");
				id_ct.setText("");
				name_ct.setText("");
				idt.setText("");
			}else {
				tishi3.setText("学生不存在或课程代码错误");
			}
		}
	}

}
