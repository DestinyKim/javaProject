package test.com;

public class Test02MemberDAOimpl implements Test02MemberDAO {

	@Override
	public int insert(Test02MemberVO vo) {
		System.out.println("insert()..");
		System.out.println(vo);
		System.out.println(vo.getNum());
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		return 0;
	}

	@Override
	public int update(Test02MemberVO vo) {
		System.out.println("update()..");
		System.out.println(vo);
		System.out.println(vo.getNum());
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
		return 0;
	}

	@Override
	public int delete(Test02MemberVO vo) {
		System.out.println("delete()..");
		System.out.println(vo);
		System.out.println(vo.getNum());
		return 0;
	}

	@Override
	public Test02MemberVO selelctOne(Test02MemberVO vo) {
		System.out.println("selelctOne()..");
		print(vo);
		Test02MemberVO vo2 = new Test02MemberVO();
		vo2.setNum(888);
		vo2.setId("admin");
		vo2.setPw("1234");
		vo2.setName("kim");
		vo2.setTel("010");
		
		return vo2;
	}

	@Override
	public Test02MemberVO[] selectAll() {
		System.out.println("selectAll()..");
		Test02MemberVO[] vos = new Test02MemberVO[2];
		Test02MemberVO vo = new Test02MemberVO();
		vo.setNum(777);
		vo.setId("admin77");
		vo.setPw("123477");
		vo.setName("kim77");
		vo.setTel("01077");
		vos[0] = vo;
		Test02MemberVO vo2 = new Test02MemberVO();
		vo2.setNum(999);
		vo2.setId("admin99");
		vo2.setPw("123499");
		vo2.setName("kim99");
		vo2.setTel("01099");
		vos[1] = vo2;
		return vos;
	}
	
	public void print(Test02MemberVO vo) {
		System.out.println(vo);
		System.out.println(vo.getNum());
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getName());
		System.out.println(vo.getTel());
	}

}
