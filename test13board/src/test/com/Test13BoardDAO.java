package test.com;

import java.util.ArrayList;

public interface Test13BoardDAO {

	public int insert(Test13BoardVO vo);
	public int update(Test13BoardVO vo);
	public int delete(Test13BoardVO vo);
	public Test13BoardVO selectOne(Test13BoardVO vo);
	public ArrayList<Test13BoardVO> selectAll();
}
