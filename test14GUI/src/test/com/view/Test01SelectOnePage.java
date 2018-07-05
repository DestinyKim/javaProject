package test.com.view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.com.model.Test01VO;

public class Test01SelectOnePage extends JFrame {
	
	public Test01SelectOnePage() {}
	public Test01SelectOnePage(final int col1) {
		
		Test01VO vo = new Test01VO();
		vo.setColumn1(col1);
		Test01VO vo2 = Test01HomePage.dao.selectOne(vo);
		System.out.print(vo2.getColumn1()+" ");
		System.out.print(vo2.getColumn2()+" ");
		System.out.print(vo2.getColumn3()+" ");
		System.out.print(vo2.getColumn4()+" ");
		System.out.print(vo2.getColumn5()+" ");
		System.out.println(vo2.getColumn6());
		
		JTextField jf_col2 = new JTextField(vo2.getColumn2());
		JTextField jf_col3 = new JTextField(vo2.getColumn3());
		JTextField jf_col4 = new JTextField(vo2.getColumn4());
		JTextField jf_col5 = new JTextField(vo2.getColumn5());
		JTextField jf_col6 = new JTextField(vo2.getColumn6());
		
		JButton updateOKbtn = new JButton("updateOK");
		updateOKbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Test01VO vo = new Test01VO();
				vo.setColumn1(col1);
				vo.setColumn2(jf_col2.getText());
				vo.setColumn3(jf_col3.getText());
				vo.setColumn4(jf_col4.getText());
				vo.setColumn5(jf_col5.getText());
				vo.setColumn6(jf_col6.getText());
				int result = Test01HomePage.dao.update(vo);
				if(result>0) {
					System.out.println("수정성공");
					dispose();
					new Test01SelectAllPage();
				}else {
					System.out.println("수정실패");
				}
			}
		});
		
		JButton deleteBtn = new JButton("deleteBtn");
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Test01DeletePage(col1);
			}
		});
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(7, 2));
		con.add(new JLabel("col1"));
		con.add(new JLabel(String.valueOf(col1)));
		con.add(new JLabel("col2"));
		con.add(jf_col2);
		con.add(new JLabel("col3"));
		con.add(jf_col3);
		con.add(new JLabel("col4"));
		con.add(jf_col4);
		con.add(new JLabel("col5"));
		con.add(jf_col5);
		con.add(new JLabel("col6"));
		con.add(jf_col6);
		con.add(updateOKbtn);
		con.add(deleteBtn);
		
		setTitle("SelectOnePage");
		setBounds(0, 300, 250, 350);
		setVisible(true);
	}

}
