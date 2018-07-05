package test.com;

public class Test04ScoreDAO {

	// 1.insert
	public int insert(Test04ScoreVO vo) {
		System.out.println("insert()....");
		System.out.println(vo.getNum());
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTotal());
		System.out.println(vo.getAvg());
		System.out.println(vo.getGrade());
		return 0;
	}

	// 2.update
	public int update(Test04ScoreVO vo) {
		System.out.println("update()....");
		System.out.println(vo.getNum());
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTotal());
		System.out.println(vo.getAvg());
		System.out.println(vo.getGrade());
		return 0;
	}

	// 3.delete
	public int delete(Test04ScoreVO vo) {
		System.out.println("delete()....");
		System.out.println(vo.getNum());
		return 0;
	}

	// 4.selectOne
	public Test04ScoreVO selectOne(Test04ScoreVO vo) {
		System.out.println("selectOne()....");
		System.out.println(vo.getNum());
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getEng());
		System.out.println(vo.getMath());
		System.out.println(vo.getTotal());
		System.out.println(vo.getAvg());
		System.out.println(vo.getGrade());
		
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
		
		
		return vo4;
	}

	// 5.selectAll
	public Test04ScoreVO[] selectAll() {
		System.out.println("selectAll()...");
		Test04ScoreVO[] vos = new Test04ScoreVO[2];
		vos[0] = new Test04ScoreVO();
		vos[0].setNum(1);
		vos[0].setName("kim");
		vos[0].setKor(100);
		vos[0].setEng(90);
		vos[0].setMath(80);
		vos[0].setTotal(vos[0].getKor()+vos[0].getEng()+vos[0].getMath());
		vos[0].setAvg(vos[0].getTotal()/3.0);
		String grade = "";
		if(vos[0].getAvg() >= 90) {
			grade = "A";
		}else if(vos[0].getAvg() >= 80) {
			grade = "B";
		}else if(vos[0].getAvg() >= 70) {
			grade = "C";
		}else {
			grade = "과락";
		}
		vos[0].setGrade(grade);
		
		
		vos[1] = new Test04ScoreVO();
		vos[1].setNum(77);
		vos[1].setName("kim77");
		vos[1].setKor(77);
		vos[1].setEng(77);
		vos[1].setMath(77);
		vos[1].setTotal(vos[1].getKor()+vos[1].getEng()+vos[1].getMath());
		vos[1].setAvg(vos[1].getTotal()/3.0);
		String grade2 = "";
		if(vos[1].getAvg() >= 90) {
			grade2 = "A";
		}else if(vos[1].getAvg() >= 80) {
			grade2 = "B";
		}else if(vos[1].getAvg() >= 70) {
			grade2 = "C";
		}else {
			grade2 = "과락";
		}
		vos[1].setGrade(grade2);
		return vos;
	}

}
