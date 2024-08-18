package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import entity.Student;
import service.lmpl.Servicelmpl;

public class addStu extends JFrame implements ActionListener {
	private static Servicelmpl service=new Servicelmpl();
	private JFrame jframe;
	private JLabel namel;
	private JTextField namet;
	private JLabel idl;
	private JTextField idt;
	private JLabel sexl;
	private JTextField sext;
	private JLabel oldl;
	private JTextField oldt;
	private JLabel heightl;
	private JTextField heightt;
	private JLabel weightl;
	private JTextField weightt;
	private JLabel tell;
	private JTextField telt;
	private JLabel addl;
	private JTextField addt;
	private JLabel gradel;
	private JTextField gradet;
	private JLabel graduatel;
	private JTextField graduatet;
	private JButton button;
	private JLabel tishi1;
	private JLabel tishi2;
	private JLabel tishi3;
	private JLabel tishi4;
	private JLabel tishi5;
	private JLabel tishi6;
	private JLabel tishi7;
	private JLabel tishi8;
	private JLabel tishi9;
	private JLabel tishi10;
	private JLabel tishi11;
	
	public addStu() {
		jframe=new JFrame("添加学生信息");
		jframe.setSize(600, 600);
		jframe.setLayout(null);
		
		namel=new JLabel("姓名:");
		namel.setSize(30, 20);
		namel.setLocation(200, 50);
		jframe.add(namel);
		
		namet=new JTextField();
		namet.setSize(200, 20);
		namet.setLocation(240, 52);
		jframe.add(namet);
		
		tishi1=new JLabel();
		tishi1.setSize(80, 20);
		tishi1.setLocation(450, 50);
		jframe.add(tishi1);
		
		idl=new JLabel("学号:");
		idl.setSize(30, 20);
		idl.setLocation(200, 80);
		jframe.add(idl);
		
		idt=new JTextField();
		idt.setSize(200, 20);
		idt.setLocation(240, 82);
		jframe.add(idt);
		
		tishi2=new JLabel();
		tishi2.setSize(80, 20);
		tishi2.setLocation(450, 80);
		jframe.add(tishi2);
		
		sexl=new JLabel("性别:");
		sexl.setSize(30, 20);
		sexl.setLocation(200, 110);
		jframe.add(sexl);
		
		sext=new JTextField();
		sext.setSize(200, 20);
		sext.setLocation(240, 112);
		jframe.add(sext);
		
		tishi3=new JLabel();
		tishi3.setSize(80, 20);
		tishi3.setLocation(450, 110);
		jframe.add(tishi3);
		
		oldl=new JLabel("年龄:");
		oldl.setSize(30, 20);
		oldl.setLocation(200, 140);
		jframe.add(oldl);
		
		oldt=new JTextField();
		oldt.setSize(200, 20);
		oldt.setLocation(240, 142);
		jframe.add(oldt);
		
		tishi4=new JLabel();
		tishi4.setSize(80, 20);
		tishi4.setLocation(450, 140);
		jframe.add(tishi4);
		
		heightl=new JLabel("身高:");
		heightl.setSize(30, 20);
		heightl.setLocation(200, 170);
		jframe.add(heightl);
		
		heightt=new JTextField();
		heightt.setSize(200, 20);
		heightt.setLocation(240, 172);
		jframe.add(heightt);
		
		tishi5=new JLabel();
		tishi5.setSize(80, 20);
		tishi5.setLocation(450, 170);
		jframe.add(tishi5);
		
		weightl=new JLabel("体重:");
		weightl.setSize(30, 20);
		weightl.setLocation(200, 200);
		jframe.add(weightl);
		
		weightt=new JTextField();
		weightt.setSize(200, 20);
		weightt.setLocation(240, 202);
		jframe.add(weightt);
		
		tishi6=new JLabel();
		tishi6.setSize(80, 20);
		tishi6.setLocation(450, 200);
		jframe.add(tishi6);
		
		tell=new JLabel("电话:");
		tell.setSize(30, 20);
		tell.setLocation(200, 230);
		jframe.add(tell);
		
		telt=new JTextField();
		telt.setSize(200, 20);
		telt.setLocation(240, 232);
		jframe.add(telt);
		
		tishi7=new JLabel();
		tishi7.setSize(80, 20);
		tishi7.setLocation(450, 230);
		jframe.add(tishi7);
		
		addl=new JLabel("籍贯:");
		addl.setSize(30, 20);
		addl.setLocation(200, 260);
		jframe.add(addl);
		
		addt=new JTextField();
		addt.setSize(200, 20);
		addt.setLocation(240, 262);
		jframe.add(addt);
		
		tishi8=new JLabel();
		tishi8.setSize(80, 20);
		tishi8.setLocation(450, 260);
		jframe.add(tishi8);
		
		gradel=new JLabel("年级:");
		gradel.setSize(30, 20);
		gradel.setLocation(200, 290);
		jframe.add(gradel);
		
		gradet=new JTextField();
		gradet.setSize(200, 20);
		gradet.setLocation(240, 292);
		jframe.add(gradet);
		
		tishi9=new JLabel();
		tishi9.setSize(80, 20);
		tishi9.setLocation(450, 290);
		jframe.add(tishi9);
		
		graduatel=new JLabel("是否毕业:");
		graduatel.setSize(60, 20);
		graduatel.setLocation(175, 320);
		jframe.add(graduatel);
		
		graduatet=new JTextField("false");
		graduatet.setSize(200, 20);
		graduatet.setLocation(240, 322);
		jframe.add(graduatet);
		
		tishi10=new JLabel();
		tishi10.setSize(80, 20);
		tishi10.setLocation(450, 320);
		jframe.add(tishi10);
		
		button=new JButton("添加学生");
		button.setSize(120, 40);
		button.setLocation(260, 400);
		jframe.add(button);
		button.addActionListener(this);
		
		tishi11=new JLabel();
		tishi11.setSize(80, 30);
		tishi11.setLocation(400, 400);
		jframe.add(tishi11);
		
		jframe.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		tishi11.setText("");
		boolean flag=true;
		if(namet.getText().equals("")) {
			tishi1.setText("不能为空");
			flag=false;
		}else {
			tishi1.setText("");
		}
		if(idt.getText().equals("")) {
			tishi2.setText("不能为空");
			flag=false;
		}else {
			tishi2.setText("");
		}
		if(sext.getText().equals("")) {
			tishi3.setText("不能为空");
			flag=false;
		}else if(sext.getText().length()!=1) {
			tishi3.setText("请输入单个字符");
			sext.setText("");
			flag=false;
		}else {
			tishi3.setText("");
		}
		if(oldt.getText().equals("")) {
			tishi4.setText("不能为空");
			flag=false;
		}else if(!oldt.getText().matches("^[0-9]+$")) {
			tishi4.setText("请输入整数");
			oldt.setText("");
			flag=false;
		}else {
			tishi4.setText("");
		}
		if(heightt.getText().equals("")) {
			tishi5.setText("不能为空");
			flag=false;
		}else if(!heightt.getText().matches("^(\\d+)(\\.\\d+)?$")) {
			tishi5.setText("请输入数字");
			heightt.setText("");
			flag=false;
		}else {
			tishi5.setText("");
		}
		if(weightt.getText().equals("")) {
			tishi6.setText("不能为空");
			flag=false;
		}else if(!weightt.getText().matches("^(\\d+)(\\.\\d+)?$")) {
			tishi6.setText("请输入数字");
			weightt.setText("");
			flag=false;
		}else {
			tishi6.setText("");
		}
		if(telt.getText().equals("")) {
			tishi7.setText("不能为空");
			flag=false;
		}else {
			tishi7.setText("");
		}
		if(addt.getText().equals("")) {
			tishi8.setText("不能为空");
			flag=false;
		}else {
			tishi8.setText("");
		}
		if(gradet.getText().equals("")) {
			tishi9.setText("不能为空");
			flag=false;
		}else if(!gradet.getText().matches("^[0-9]+$")) {
			tishi9.setText("请输入整数");
			gradet.setText("");
			flag=false;
		}else {
			tishi9.setText("");
		}
		if(graduatet.getText().equals("")) {
			tishi10.setText("不能为空");
			flag=false;
		}else if(!graduatet.getText().matches("^(true)|(false)$")) {
			tishi10.setText("true或false");
			graduatet.setText("");
			flag=false;
		}else {
			tishi10.setText("");
		}
		if(flag) {
			Student student=new Student(namet.getText(),idt.getText(),sext.getText().charAt(0),Integer.parseInt(oldt.getText()),
					Float.parseFloat(heightt.getText()),Double.parseDouble(weightt.getText()),telt.getText(),addt.getText(),
					Integer.parseInt(gradet.getText()),Boolean.parseBoolean(graduatet.getText()));
			
			if(service.增加(student)) {
				tishi11.setText("添加成功");
				namet.setText("");
				idt.setText("");
				sext.setText("");
				oldt.setText("");
				heightt.setText("");
				weightt.setText("");
				telt.setText("");
				addt.setText("");
				gradet.setText("");
				graduatet.setText("");
			}else {
				tishi2.setText("学号已存在");
			}
		}
		
	}

}
