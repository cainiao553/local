package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entity.User;
import service.lmpl.Servicelmpl;

public class addUser extends JFrame implements ActionListener {
	private static Servicelmpl service=new Servicelmpl();
	private JFrame jframe;
	private JLabel idl;
	private JTextField idt;
	private JLabel pwdl;
	private JTextField pwdt;
	private JButton button;
	private JLabel tishi1;
	private JLabel tishi2;
	private JLabel tishi3;
	public addUser() {
		// TODO 自动生成的构造函数存根
		jframe=new JFrame("注册用户");
		jframe.setSize(600, 600);
		jframe.setLayout(null);
		
		idl=new JLabel("用户名:");
		idl.setSize(60, 30);
		idl.setLocation(150, 150);
		jframe.add(idl);
		
		idt=new JTextField();
		idt.setSize(200,35);
		idt.setLocation(210, 150);
		jframe.add(idt);
		
		tishi1=new JLabel();
		tishi1.setSize(100, 30);
		tishi1.setLocation(420, 150);
		jframe.add(tishi1);
		
		pwdl=new JLabel("密码:");
		pwdl.setSize(60, 30);
		pwdl.setLocation(162, 200);
		jframe.add(pwdl);
		
		pwdt=new JTextField();
		pwdt.setSize(200,35);
		pwdt.setLocation(210, 200);
		jframe.add(pwdt);
		
		tishi2=new JLabel();
		tishi2.setSize(100, 30);
		tishi2.setLocation(420, 200);
		jframe.add(tishi2);
		
		button=new JButton("注册");
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
		if(pwdt.getText().equals("")) {
			tishi2.setText("不能为空");
		}else {
			tishi2.setText("");
		}
		if(flag) {
			User user=new User(idt.getText(),pwdt.getText());
			if(service.增加用户(user)) {
				tishi3.setText("添加成功");
				idt.setText("");
				pwdt.setText("");
			}else {
				tishi1.setText("用户名已存在");
			}
		}
	}

}
