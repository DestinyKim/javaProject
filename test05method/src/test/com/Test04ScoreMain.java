package test.com;

public class Test04ScoreMain {

	public static void main(String[] args) {
		System.out.println("score...");
		Test04ScoreDAO dao = new Test04ScoreDAO();
		System.out.println(dao);
		
		
		//입력,수정,삭제,검색(단일결과,복수결과)
		
		
		//1.insert(Test04ScoreVO vo):int
		Test04ScoreVO vo = new Test04ScoreVO();
		vo.setNum(1);
		vo.setName("kim");
		vo.setKor(100);
		vo.setEng(90);
		vo.setMath(80);
		vo.setTotal(vo.getKor()+vo.getEng()+vo.getMath());
		vo.setAvg(vo.getTotal()/3.0);
		String grade = "";
		if(vo.getAvg() >= 90) {
			grade = "A";
		}else if(vo.getAvg() >= 80) {
			grade = "B";
		}else if(vo.getAvg() >= 70) {
			grade = "C";
		}else {
			grade = "과락";
		}
		vo.setGrade(grade);
		int result1 = dao.insert(vo);
		System.out.println("result1:"+result1);
		
		//2.update(Test04ScoreVO vo):int
		Test04ScoreVO vo2 = new Test04ScoreVO();
		vo2.setNum(11);
		vo2.setName("kim11");
		vo2.setKor(88);
		vo2.setEng(88);
		vo2.setMath(88);
		vo2.setTotal(vo2.getKor()+vo2.getEng()+vo2.getMath());
		vo2.setAvg(vo2.getTotal()/3.0);
		String grade2 = "";
		if(vo2.getAvg() >= 90) {
			grade2 = "A";
		}else if(vo2.getAvg() >= 80) {
			grade2 = "B";
		}else if(vo2.getAvg() >= 70) {
			grade2 = "C";
		}else {
			grade2 = "과락";
		}
		vo2.setGrade(grade2);
		int result2 = dao.update(vo2);
		System.out.println("result2:"+result2);
		
		
		//3.delete(Test04ScoreVO vo):int
		Test04ScoreVO vo3 = new Test04ScoreVO();
		vo3.setNum(33);
		int result3 = dao.delete(vo3);
		System.out.println("result3:"+result3);
		
		
		//4.selectOne(Test04ScoreVO vo):Test04ScoreVO
		Test04ScoreVO vo4 = new Test04ScoreVO();
		vo4.setNum(44);
		vo4.setName("kim44");
		vo4.setKor(44);
		vo4.setEng(44);
		vo4.setMath(44);
		vo4.setTotal(vo4.getKor()+vo4.getEng()+vo4.getMath());
		vo4.setAvg(vo4.getTotal()/3.0);
		String grade4 = "";
		if(vo4.getAvg() >= 90) {
			grade4 = "A";
		}else if(vo4.getAvg() >= 80) {
			grade4 = "B";
		}else if(vo4.getAvg() >= 70) {
			grade4 = "C";
		}else {
			grade4 = "과락";
		}
		vo4.setGrade(grade4);
		Test04ScoreVO result4 = dao.selectOne(vo4);
		System.out.println("result4:"+result4);
		System.out.println(result4.getNum());
		System.out.println(result4.getName());
		System.out.println(result4.getKor());
		System.out.println(result4.getEng());
		System.out.println(result4.getMath());
		System.out.println(result4.getTotal());
		System.out.println(result4.getAvg());
		System.out.println(result4.getGrade());
		
		//5.selectAll():Test04ScoreVO[]
		Test04ScoreVO[] result5 = dao.selectAll();
		System.out.println("result5:"+result5);
		System.out.println("result5.length:"+result5.length);
		System.out.println(result5[0]);
		System.out.println(result5[0].getNum());
		System.out.println(result5[0].getName());
		System.out.println(result5[0].getKor());
		System.out.println(result5[0].getEng());
		System.out.println(result5[0].getMath());
		System.out.println(result5[0].getTotal());
		System.out.println(result5[0].getAvg());
		System.out.println(result5[0].getGrade());
		System.out.println(result5[1]);
		System.out.println(result5[1].getNum());
		System.out.println(result5[1].getName());
		System.out.println(result5[1].getKor());
		System.out.println(result5[1].getEng());
		System.out.println(result5[1].getMath());
		System.out.println(result5[1].getTotal());
		System.out.println(result5[1].getAvg());
		System.out.println(result5[1].getGrade());
	}

}
