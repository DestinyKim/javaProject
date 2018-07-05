package test.com;

import java.util.ArrayList;

public interface Test11MemberDAO {
	public int insert(Test11MemberVO vo);
	public int update(Test11MemberVO vo);
	public int delete(Test11MemberVO vo);
	public Test11MemberVO selectOne(Test11MemberVO vo);
	public ArrayList<Test11MemberVO> selectAll();
}
