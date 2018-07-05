package test.com;

public interface Test02MemberDAO {
	String NAME = "kim";

	public int insert(Test02MemberVO vo);

	public int update(Test02MemberVO vo);

	public int delete(Test02MemberVO vo);

	public Test02MemberVO selelctOne(Test02MemberVO vo);

	public Test02MemberVO[] selectAll();

}
