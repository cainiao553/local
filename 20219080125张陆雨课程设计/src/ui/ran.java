package ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import entity.Student;
import service.lmpl.Servicelmpl;

public class ran extends JFrame implements ActionListener {
	private static Servicelmpl service=new Servicelmpl();
	private JFrame jframe;
	private JTextArea jtArea;
	private JPanel panel;
	private JScrollPane pane;
	private JButton button;
	public ran() {
		jframe=new JFrame("随机同学信息");
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
		
		for(Student student:service.random_print()) {
			if(student==null) {
				break;
			}
			jtArea.append(student.toString()+"\r\n");
		}
		
		
		jframe.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根

	}

}
