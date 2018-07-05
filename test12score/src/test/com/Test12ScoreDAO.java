package test.com;

import java.util.ArrayList;

public interface Test12ScoreDAO {
	public int insert(Test12ScoreVO vo);
	public int update(Test12ScoreVO vo);
	public int delete(Test12ScoreVO vo);
	public Test12ScoreVO selectOne(Test12ScoreVO vo);
	public ArrayList<Test12ScoreVO> selectAll();
}
