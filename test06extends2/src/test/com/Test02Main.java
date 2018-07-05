package test.com;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Member...");

		Test02MemberDAO dao = new Test02MemberDAOimpl();
		System.out.println(dao);

		// 1.insert
		Test02MemberVO vo = new Test02MemberVO();
		vo.setNum(111);
		vo.setId("admin11");
		vo.setPw("123411");
		vo.setName("kim11");
		vo.setTel("01011");
		int result = dao.insert(vo);
		System.out.println("result:" + result);

		// 2.update
		Test02MemberVO vo2 = new Test02MemberVO();
		vo2.setNum(222);
		vo2.setId("admin22");
		vo2.setPw("123422");
		vo2.setName("kim22");
		vo2.setTel("01022");
		int result2 = dao.update(vo2);
		System.out.println("result2:" + result2);

		// 3.delete
		Test02MemberVO vo3 = new Test02MemberVO();
		vo3.setNum(333);
		int result3 = dao.delete(vo3);
		System.out.println("result3:" + result3);

		// 4.selelctOne
		Test02MemberVO vo4 = new Test02MemberVO();
		vo4.setNum(444);
		vo4.setId("admin44");
		vo4.setPw("123444");
		vo4.setName("kim44");
		vo4.setTel("01044");
		Test02MemberVO result4 = dao.selelctOne(vo4);
		System.out.println("result4:" + result4);
		System.out.println(result4.getNum());
		System.out.println(result4.getId());
		System.out.println(result4.getPw());
		System.out.println(result4.getName());
		System.out.println(result4.getTel());
		
		//5.selectAll
		Test02MemberVO[] result5 = dao.selectAll();
		System.out.println("result5.length:"+result5.length);
		for (int i = 0; i < result5.length; i++) {
			System.out.print(result5[i].getNum()+" ");
			System.out.print(result5[i].getId()+" ");
			System.out.print(result5[i].getPw()+" ");
			System.out.print(result5[i].getName()+" ");
			System.out.println(result5[i].getTel());
		}
		for (Test02MemberVO x : result5) {
			System.out.print(x.getNum()+" ");
			System.out.print(x.getId()+" ");
			System.out.print(x.getPw()+" ");
			System.out.print(x.getName()+" ");
			System.out.println(x.getTel());
		}
	}

}
