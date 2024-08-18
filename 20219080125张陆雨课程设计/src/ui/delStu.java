package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import service.lmpl.Servicelmpl;

public class delStu extends JFrame implements ActionListener {
	private static Servicelmpl service=new Servicelmpl();
	private JFrame jframe;
	private JLabel idl;
	private JTextField idt;
	private JLabel tishi1;
	private JLabel tishi2;
	private JButton button;
	public delStu() {
		// TODO 自动生成的构造函数存根
		jframe=new JFrame("删除学生信息");
		jframe.setSize(600, 600);
		jframe.setLayout(null);
		
		idl=new JLabel("请输入要删除学生的学号:");
		idl.setSize(150, 30);
		idl.setLocation(100, 150);
		jframe.add(idl);
		
		idt=new JTextField();
		idt.setSize(300, 30);
		idt.setLocation(250, 152);
		jframe.add(idt);
		
		tishi1=new JLabel("");
		tishi1.setSize(100, 30);
		tishi1.setLocation(250, 120);
		jframe.add(tishi1);
		
		tishi2=new JLabel("");
		tishi2.setSize(50, 30);
		tishi2.setLocation(300, 200);
		jframe.add(tishi2);
		
		button=new JButton("删除");
		button.setSize(60, 30);
		button.setLocation(230, 200);
		jframe.add(button);
		button.addActionListener(this);
		
		jframe.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		tishi2.setText("");
		if(service.删除(idt.getText())) {
			tishi1.setText("");
			idt.setText("");
			tishi2.setText("删除成功");
		}else if(idt.getText().equals("")) {
			tishi1.setText("不能为空");
		}else {
			tishi1.setText("学生不存在");
		}
	}

}
