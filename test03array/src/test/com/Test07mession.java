package test.com;

public class Test07mession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mession");
		
		//번호 이름 국어 영어 수학 총점 평균 등급
		String[] titles = new String[] {
				"번호","이름","국어","영어","수학",
				"총점","평균","등급"};
		for (int i = 0; i < titles.length; i++) {
			System.out.print(titles[i]+" ");
		}
		System.out.println();
		
		
		//1   홍길동1 99  88  77 264 88.0 A 
		String[] row01 = new String[] {
				"1","홍길동1","99","99","0",
				null,null,null};
		row01[5] = ""+(Integer.parseInt(row01[2])+Integer.parseInt(row01[3])+Integer.parseInt(row01[4]));
		row01[6] = ""+Integer.parseInt(row01[5])/3.0;
		
		switch ((int) Double.parseDouble(row01[6]) / 10) {
		case 10:
		case 9:
			row01[7] = "A";
			break;
		case 8:
			row01[7] = "B";
			break;
		case 7:
			row01[7] = "C";
			break;
		default:
			row01[7] = "과락";
			break;
		}
		for (int i = 0; i < row01.length; i++) {
			System.out.print(row01[i]+" ");
		}
		System.out.println();
		
		
		//2   홍길동2 99  88  77 264 88.0 A 
		String[] row02 = new String[] {
				"2","홍길동2","11","22","33",
				null,null,null};
		row02[5] = ""+(Integer.parseInt(row02[2])+Integer.parseInt(row02[3])+Integer.parseInt(row02[4]));
		row02[6] = ""+Integer.parseInt(row02[5])/3.0;
		
		switch ((int) Double.parseDouble(row02[6]) / 10) {
		case 10:
		case 9:
			row02[7] = "A";
			break;
		case 8:
			row02[7] = "B";
			break;
		case 7:
			row02[7] = "C";
			break;
		default:
			row02[7] = "과락";
			break;
		}
		for (int i = 0; i < row02.length; i++) {
			System.out.print(row02[i]+" ");
		}
		System.out.println();
		//3   홍길동3 99  88  77 264 88.0 A 
		String[] row03 = new String[] {
				"3","홍길동3","99","99","99",
				null,null,null};
		row03[5] = ""+(Integer.parseInt(row03[2])+Integer.parseInt(row03[3])+Integer.parseInt(row03[4]));
		row03[6] = ""+Integer.parseInt(row03[5])/3.0;
		
		switch ((int) Double.parseDouble(row03[6]) / 10) {
		case 10:
		case 9:
			row03[7] = "A";
			break;
		case 8:
			row03[7] = "B";
			break;
		case 7:
			row03[7] = "C";
			break;
		default:
			row03[7] = "과락";
			break;
		}
		for (int i = 0; i < row03.length; i++) {
			System.out.print(row03[i]+" ");
		}
		System.out.println();
		
		//배열을 이용하여 위와같이 출력하도록 하시오
		
		String[][] students = new String[4][titles.length];
		students[0] = titles;
		students[1] = row01;
		students[2] = row02;
		students[3] = row03;
		
		for (int x = 0; x < students.length; x++) {
			for (int i = 0; i < students[x].length; i++) {
				System.out.print(students[x][i]+" ");
			}
			System.out.println();
		}
	}

}
