package test.com;

public class Test02ScoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Score main...");

		Test02Score score = new Test02Score();
		System.out.println(score);

		// 1.ok
		score.setKor(88);
		System.out.println(score.kor);

		// 2.ok
		System.out.println(score.eng);
		int eng = score.getEng();
		System.out.println(eng);

		// 3.ok
		score.setMath(88);
		System.out.println("score.math:" + score.math);

		// 4.
		score.setEng(77);
		System.out.println("score.eng:" + score.eng);
		
		// 5.
		System.out.println("score.total():" + score.total());

	}

}