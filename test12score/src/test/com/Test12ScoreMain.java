package test.com;

import java.io.*;
import java.util.ArrayList;

public class Test12ScoreMain {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		Test12ScoreDAO dao = new Test12ScoreDAOImpl();
		Test12ScoreVO vo = new Test12ScoreVO();
		
		String menu = null;
		
		do {
			try {
				System.out.println("1.insert, 2.update 3. delete \n"
						+ "4.selectOne	5.selectAll	 x. Exit");
				menu = br.readLine();
					
				if (menu.compareTo("1") == 0) {
					insertUI(br, dao, vo);
				} else if (menu.compareTo("2")==0) {
					updateUI(br, dao, vo);
				} else if (menu.compareTo("3")==0) {
					deleteUI(br, dao, vo);
				} else if (menu.compareTo("4")==0) {
					selectOneUI(br, dao, vo);
				} else if (menu.compareTo("5")==0) {
					selectAllUI(dao);
				} else if (menu.compareTo("x")==0) {
					System.out.println("종료하겠습니다.");
				} else {
					System.out.println("잘못입력하셨습니다.");
				}				
			} catch (IOException e) {
				System.out.println("잘못입력하셨습니다.");
					e.printStackTrace();
			}
		} while(menu.compareTo("x")!=0);
	}
	
	public static void insertUI(BufferedReader br, Test12ScoreDAO dao, Test12ScoreVO vo) throws IOException {
		System.out.println("학생 이름을 입력하세요.");
		vo.setName(br.readLine());
		
		System.out.println("국어 점수를 입력하세요(0-100).");
		while(true) {
			vo.setKor(Integer.parseInt(br.readLine()));
			if(vo.getKor()<=100 & vo.getKor()>=0) {
				System.out.println("국어 점수가 입력되었습니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
		}
		System.out.println("영어 점수를 입력하세요(0-100).");
		while(true) {
			vo.setEng(Integer.parseInt(br.readLine()));
			if(vo.getEng()<=100 & vo.getEng()>=0) {
				System.out.println("영어 점수가 입력되었습니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
		}
		System.out.println("수학 점수를 입력하세요(0-100).");
		while(true) {
			vo.setMath(Integer.parseInt(br.readLine()));
			if(vo.getMath()<=100 & vo.getMath()>=0) {
				System.out.println("수학 점수가 입력되었습니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
		}
		
		vo.setTotal(vo.getKor()+vo.getEng()+vo.getMath());
		vo.setAvg(vo.getTotal()/3.0);
			switch((int)vo.getAvg() / 10) {
				case 10:
				case 9:
					vo.setGrade("A");
				case 8:
					vo.setGrade("B");
				case 7:
					vo.setGrade("C");
				case 6:
					vo.setGrade("D");
				default:
					vo.setGrade("F");
			}
		
		int result = dao.insert(vo);
		if(result>0) {
			System.out.println("입력성공!!");
		}
		else {
			System.out.println("입력실패...");
		}
	}
	
	public static void updateUI(BufferedReader br, Test12ScoreDAO dao, Test12ScoreVO vo) throws IOException{
		System.out.println("변경할 학생 데이터의 학생번호(num)를 입력하세요.");
		vo.setNum(Integer.parseInt(br.readLine()));
		System.out.println("학생 이름을 입력하세요.");
		vo.setName(br.readLine());
		
		System.out.println("국어 점수를 입력하세요(0-100).");
		while(true) {
			vo.setKor(Integer.parseInt(br.readLine()));
			if(vo.getKor()<=100 & vo.getKor()>=0) {
				System.out.println("국어 점수가 입력되었습니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
		}
		System.out.println("영어 점수를 입력하세요(0-100).");
		while(true) {
			vo.setEng(Integer.parseInt(br.readLine()));
			if(vo.getEng()<=100 & vo.getEng()>=0) {
				System.out.println("영어 점수가 입력되었습니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
		}
		System.out.println("수학 점수를 입력하세요(0-100).");
		while(true) {
			vo.setMath(Integer.parseInt(br.readLine()));
			if(vo.getMath()<=100 & vo.getMath()>=0) {
				System.out.println("수학 점수가 입력되었습니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
		}
		
		vo.setTotal(vo.getKor()+vo.getEng()+vo.getMath());
		vo.setAvg(vo.getTotal()/3.0);
			switch((int)vo.getAvg() / 10) {
				case 10:
				case 9:
					vo.setGrade("A");
				case 8:
					vo.setGrade("B");
				case 7:
					vo.setGrade("C");
				case 6:
					vo.setGrade("D");
				default:
					vo.setGrade("F");
			}
		
		int result = dao.update(vo);
		if(result>0) {
			System.out.println("입력성공!!");
		}
		else {
			System.out.println("입력실패...");
		}
	}
	
	public static void deleteUI(BufferedReader br, Test12ScoreDAO dao, Test12ScoreVO vo) throws IOException{
		System.out.println("삭제할 학생 데이터의 학생번호(num)를 입력하세요.");
		vo.setNum(Integer.parseInt(br.readLine()));
		
		int result = dao.delete(vo);
		if(result>0) {
			System.out.println("입력성공!!");
		}
		else {
			System.out.println("입력실패...");
		}
	}
	
	public static void selectOneUI(BufferedReader br, Test12ScoreDAO dao, Test12ScoreVO vo) throws IOException{
		System.out.println("탐색할 학생 데이터의 학생번호(num)를 입력하세요.");
		vo.setNum(Integer.parseInt(br.readLine()));
		
		Test12ScoreVO vo2 = dao.selectOne(vo);
		if(vo2.getNum()>0) {
			System.out.print(vo2.getNum()+" ");
			System.out.print(vo2.getName()+" ");
			System.out.print(vo2.getKor()+" ");
			System.out.print(vo2.getEng()+" ");
			System.out.print(vo2.getMath()+" ");
			System.out.print(vo2.getTotal()+" ");
			System.out.print(vo2.getAvg()+" ");
			System.out.println(vo2.getGrade()+" \n\n");
			} else {
				System.out.println("데이터를 찾을 수 없습니다.\n\n");
			}
	}
	
	public static void selectAllUI(Test12ScoreDAO dao) throws IOException{
		ArrayList<Test12ScoreVO> vos = dao.selectAll();
		for (Test12ScoreVO vo : vos) {
				
			System.out.print(vo.getNum()+" ");
			System.out.print(vo.getName()+" ");
			System.out.print(vo.getKor()+" ");
			System.out.print(vo.getEng()+" ");
			System.out.print(vo.getMath()+" ");
			System.out.print(vo.getTotal()+" ");
			System.out.print(vo.getAvg()+" ");
			System.out.println(vo.getGrade()+" ");
		}
		System.out.println("\n\n");
	}

}


