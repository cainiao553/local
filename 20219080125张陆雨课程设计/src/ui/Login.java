package ui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dao.lmpl.StuDaolmpl;
import entity.User;

public class Login extends JFrame implements ActionListener  {
	
	private JLabel userLa;
	private JTextField userTxt;
	private JLabel pwdLa;
	private JPasswordField  pwdTxt;
	private JButton sureBt;
	private JButton sureBt1;
	private JButton sureBt2;
	private JFrame jframe;
	private JLabel tishi;
	public Login() {
		init();
	}
	public void init() {
		
		jframe=new JFrame("登录窗口");
		jframe.setSize(500,600);
		jframe.setLayout(null);
		
		
		tishi=new JLabel();
		tishi.setSize(200,50);
		tishi.setLocation(100,40);
		jframe.add(tishi);
		
		userLa =new JLabel();
		userLa.setText("用户名:");
		userLa.setSize(60,50);
		userLa.setLocation(100,80);
		jframe.add(userLa);
		
		userTxt=new JTextField();
		userTxt.setSize(200 ,30);
		userTxt.setLocation(150,90);
		jframe.add(userTxt);
		
		pwdLa=new JLabel();
		pwdLa.setText("密码:");
		pwdLa.setSize(60,50);
		pwdLa.setLocation(100, 160);
		jframe.add(pwdLa);
		
		pwdTxt=new JPasswordField();
		pwdTxt.setSize(200, 30);
		pwdTxt.setLocation(150, 170);
		jframe.add(pwdTxt);
		
		sureBt=new JButton("登录");
		sureBt.setSize(60, 25);
		sureBt.setLocation(100, 250);
		jframe.add(sureBt);
		
		sureBt1=new JButton("退出");
		sureBt1.setSize(60, 25);
		sureBt1.setLocation(200, 250);
		jframe.add(sureBt1);
		
		sureBt2=new JButton("注册");
		sureBt2.setSize(150, 25);
		sureBt2.setLocation(300, 250);
		jframe.add(sureBt2);
		
		sureBt.addActionListener(this);
		sureBt1.addActionListener(this);
		sureBt2.addActionListener(this);
		jframe.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		JButton bt=(JButton)e.getSource();
		String str =bt.getText();
		if(str.equals("登录")) {
			String user=userTxt.getText();
			String pwd=new String(pwdTxt.getPassword());
			for(User x:StuDaolmpl.用户信息) {
				if(x==null) {
					userTxt.setText("");
					pwdTxt.setText("");
					tishi.setText("账号密码输入错误");
					break;
				}
				if(x.getId().equals(user)&&x.getPassword().equals(pwd)) {
					new Main_user();
					jframe.dispose();
				}
				
			}
		}else if(str.equals("注册")) {
			new addUser();
		}else {
			System.exit(0);
		}
	}
	
	

}
