package test.com;

public class Test03BoardDAO {
	
	Aaa a;
	Bbb b;
	
	public int insert(Test03BoardVO vo) {
		System.out.println(vo);
		System.out.println(vo.getNum());
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getName());
		
		return 1;
	}
	public int update(Test03BoardVO vo) {
		System.out.println(vo);
		System.out.println(vo.getNum());
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getName());
		return 1;
	}
	public int delete(Test03BoardVO vo) {
		System.out.println(vo);
		System.out.println(vo.getNum());
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getName());
		return 1;
	}
	public Test03BoardVO selectOne(Test03BoardVO vo) {
		System.out.println(vo);
		System.out.println(vo.getNum());
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getName());
		
		Test03BoardVO result4 = new Test03BoardVO();
		result4.setNum(44);
		result4.setTitle("java44");
		result4.setContent("study44");
		result4.setName("kim44");
		return result4;
	}
	public Test03BoardVO[] selectAll() {
		
		Test03BoardVO vo1 = new Test03BoardVO();
		vo1.setNum(10);
		vo1.setTitle("title10");
		vo1.setContent("content10");
		vo1.setName("name10");
		
		Test03BoardVO vo2 = new Test03BoardVO();
		vo2.setNum(20);
		vo2.setTitle("title20");
		vo2.setContent("content20");
		vo2.setName("name20");
		
		Test03BoardVO vo3 = new Test03BoardVO();
		vo3.setNum(30);
		vo3.setTitle("title30");
		vo3.setContent("content30");
		vo3.setName("name30");
		return new Test03BoardVO[] {
				vo1,
				vo2,
				vo3};
	}

}
