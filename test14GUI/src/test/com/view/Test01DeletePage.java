package test.com.view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import test.com.model.Test01VO;

public class Test01DeletePage extends JFrame {

	public Test01DeletePage() {}
	public Test01DeletePage(int col1) {

		Container con = getContentPane();
		con.setLayout(new GridLayout(2, 2));
		
		JButton deleteOKbtn = new JButton("deleteOK");
		deleteOKbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Test01VO vo = new Test01VO();
				vo.setColumn1(col1);
				int result = Test01HomePage.dao.delete(vo);
				if(result>0) {
					System.out.println("삭제성공");
					dispose();
					new Test01SelectAllPage();
				}else {
					System.out.println("삭제실패");
				}
			}
		});
		JButton cancelBtn = new JButton("cancel");
		cancelBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		con.add(new JLabel(String.valueOf(col1)));
		con.add(new JLabel("번을 정말삭제?"));
		con.add(deleteOKbtn);
		con.add(cancelBtn);
		
		setTitle("DeletePage");
		setBounds(250, 300, 250, 100);
		setVisible(true);
	}
}
