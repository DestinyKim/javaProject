package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test12ScoreDAOImpl implements Test12ScoreDAO {
	
	private int result = 0;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public Test12ScoreDAOImpl() {
		try {
			Class.forName(Test12ScoreDBInfo.DRIVER_NAME);
			System.out.println("Driver Access Success..");
		} catch (Exception e) {
			System.out.println("Driver Access Failed..");
		}
	}

	@Override
	public int insert(Test12ScoreVO vo) {
		try {
			conn = DriverManager.getConnection(Test12ScoreDBInfo.URL, Test12ScoreDBInfo.USER_ID, Test12ScoreDBInfo.USER_PW);
			System.out.println("conn successed...");
			
			String sql = "insert into score(num, name, kor, eng, math, total, avg, grade) values(SEQ2.nextval,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getKor());
			pstmt.setInt(3, vo.getEng());
			pstmt.setInt(4, vo.getMath());
			pstmt.setInt(5, vo.getTotal());
			pstmt.setDouble(6, vo.getAvg());
			pstmt.setString(7, vo.getGrade());
			
			result = pstmt.executeUpdate();
			System.out.println("result: "+result);
			
		} catch (SQLException e) {
			System.out.println("pstmt failed...");
			e.printStackTrace();
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return result;
	}

	@Override
	public int update(Test12ScoreVO vo) {
		try {
			conn = DriverManager.getConnection(Test12ScoreDBInfo.URL, Test12ScoreDBInfo.USER_ID, Test12ScoreDBInfo.USER_PW);
			System.out.println("conn Sucess...");
			
			String sql = "update score set name = ?, kor = ?, eng = ?, math = ?, total = ?, avg = ?, grade = ? where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getKor());
			pstmt.setInt(3, vo.getEng());
			pstmt.setInt(4, vo.getMath());
			pstmt.setInt(5, vo.getTotal());
			pstmt.setDouble(6, vo.getAvg());
			pstmt.setString(7, vo.getGrade());
			pstmt.setInt(8, vo.getNum());
			
			result = pstmt.executeUpdate();
			System.out.println("result: "+result);
			
		} catch (SQLException e) {
			System.out.println("pstmt failed...");
			e.printStackTrace();
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}

	@Override
	public int delete(Test12ScoreVO vo) {
		try {
			conn = DriverManager.getConnection(Test12ScoreDBInfo.URL, Test12ScoreDBInfo.USER_ID, Test12ScoreDBInfo.USER_PW);
			System.out.println("conn success...");
			
			String sql = "delete from score where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getNum());
			
			result = pstmt.executeUpdate();
			System.out.println("result: " + result);
			
		} catch (SQLException e) {
			System.out.println("pstmt failed...");
			e.printStackTrace();
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}

	@Override
	public Test12ScoreVO selectOne(Test12ScoreVO vo) {
		Test12ScoreVO vo2 = new Test12ScoreVO();
		
		try {
			conn = DriverManager.getConnection(Test12ScoreDBInfo.URL, Test12ScoreDBInfo.USER_ID, Test12ScoreDBInfo.USER_PW);
			System.out.println("conn success...");
			
			String sql = "select * from score where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getNum());
			
			rs = pstmt.executeQuery();
			System.out.println("result: " + result);
			
			while(rs.next()) {
				vo2.setNum(rs.getInt("num"));
				vo2.setName(rs.getString("name"));
				vo2.setKor(rs.getInt("kor"));
				vo2.setEng(rs.getInt("eng"));
				vo2.setMath(rs.getInt("math"));
				vo2.setTotal(rs.getInt("total"));
				vo2.setAvg(rs.getDouble("avg"));
				vo2.setGrade(rs.getString("grade"));
			}
			
		} catch (SQLException e) {
			System.out.println("pstmt failed...");
			e.printStackTrace();
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		return vo2;
	}

	@Override
	public ArrayList<Test12ScoreVO> selectAll() {
		ArrayList<Test12ScoreVO> vos = new ArrayList<Test12ScoreVO>();
		
		try {
			conn = DriverManager.getConnection(Test12ScoreDBInfo.URL, Test12ScoreDBInfo.USER_ID, Test12ScoreDBInfo.USER_PW);
			System.out.println("conn success...");
			
			String sql = "select * from score";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			System.out.println("result: " + rs);
			
			while(rs.next()) {
				Test12ScoreVO vo = new Test12ScoreVO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setKor(rs.getInt("kor"));
				vo.setEng(rs.getInt("eng"));
				vo.setMath(rs.getInt("math"));
				vo.setTotal(rs.getInt("total"));
				vo.setAvg(rs.getDouble("avg"));
				vo.setGrade(rs.getString("grade"));
				vos.add(vo);
			}
			
		} catch (SQLException e) {
			System.out.println("pstmt failed...");
			e.printStackTrace();
		} finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return vos;
	}

}
