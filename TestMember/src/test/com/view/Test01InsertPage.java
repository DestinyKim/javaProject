package test.com.view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import test.com.model.Test01DAO;
import test.com.model.Test01DAOimpl;
import test.com.model.Test01VO;

public class Test01InsertPage extends JFrame {
	
	
	public Test01InsertPage() {
		System.out.println("Test01InsertPage....");
		
		Container con = getContentPane();
		con.setLayout(new GridLayout(6, 2));
		
		final JTextField jt_col2 = new JTextField("11");
		final JTextField jt_col3 = new JTextField("22");
		final JTextField jt_col4 = new JTextField("33");
		final JTextField jt_col5 = new JTextField("44");
		final JTextField jt_col6 = new JTextField("55");
		
		JButton okBtn = new JButton("OK");
		okBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("clicked okBtn");
				System.out.println(jt_col2.getText());
				System.out.println(jt_col3.getText());
				System.out.println(jt_col4.getText());
				System.out.println(jt_col5.getText());
				System.out.println(jt_col6.getText());
				Test01VO vo = new Test01VO();
				vo.setColumn2(jt_col2.getText());
				vo.setColumn3(jt_col3.getText());
				vo.setColumn4(jt_col4.getText());
				vo.setColumn5(jt_col5.getText());
				vo.setColumn6(jt_col6.getText());
				
				int result = Test01HomePage.dao.insert(vo);
				System.out.println("result:" + result);
				if(result==1) {
					System.out.println("입력성공");
					new Test01SelectAllPage();
					dispose();
				}else{
					System.out.println("입력실패");
				}
			}
		});
		
		JButton selectBtn = new JButton("SelectAllPage");
		selectBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("clicked selectBtn");
				new Test01SelectAllPage();
				//dispose();//보고있는페이지 닫기
				//System.exit(0);//강제종료
				//setVisible(false);//안보기
			}
		});
		
		con.add(new JLabel("col2"));
		con.add(jt_col2);
		con.add(new JLabel("col3"));
		con.add(jt_col3);
		con.add(new JLabel("col4"));
		con.add(jt_col4);
		con.add(new JLabel("col5"));
		con.add(jt_col5);
		con.add(new JLabel("col6"));
		con.add(jt_col6);
		con.add(okBtn);
		con.add(selectBtn);
		
		setTitle("InsertPage");
		setBounds(250, 0, 250, 300);
		setVisible(true);
	}

}
