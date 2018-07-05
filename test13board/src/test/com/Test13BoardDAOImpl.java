package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test13BoardDAOImpl implements Test13BoardDAO {
	
	private int result = 0;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public Test13BoardDAOImpl() {
		try {
			Class.forName(Test13BoardDBInfo.DRIVER_NAME);
			System.out.println("Driver Access Success..");
		} catch (Exception e) {
			System.out.println("Driver Access Failed..");
		}
	}

	@Override
	public int insert(Test13BoardVO vo) {
		try {
			conn = DriverManager.getConnection(Test13BoardDBInfo.URL, Test13BoardDBInfo.USER_ID, Test13BoardDBInfo.USER_PW);
			System.out.println("conn successed...");
			
			String sql = "insert into board(num, title, content, name) values(seq3.nextval,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getName());
			
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
	public int update(Test13BoardVO vo) {
		try {
			conn = DriverManager.getConnection(Test13BoardDBInfo.URL, Test13BoardDBInfo.USER_ID, Test13BoardDBInfo.USER_PW);
			System.out.println("conn successed...");
			
			String sql = "update board set title = ?, content= ?, name = ? where = num =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setString(3, vo.getName());
			pstmt.setInt(4, vo.getNum());
			
			result = pstmt.executeUpdate();
			System.out.println("result: "+ result);
			
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
	public int delete(Test13BoardVO vo) {
		try {
			conn = DriverManager.getConnection(Test13BoardDBInfo.URL, Test13BoardDBInfo.USER_ID, Test13BoardDBInfo.USER_PW);
			System.out.println("conn successed...");
			
		String sql = "delete from board where num = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, vo.getNum());
		result = pstmt.executeUpdate();
		System.out.println("result: "+ result);
		
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
	public Test13BoardVO selectOne(Test13BoardVO vo) {
		Test13BoardVO vo2 = new Test13BoardVO();
		
		try {
			conn = DriverManager.getConnection(Test13BoardDBInfo.URL, Test13BoardDBInfo.USER_ID, Test13BoardDBInfo.USER_PW);
			System.out.println("conn success...");
			
			String sql = "select * from board where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getNum());
			
			rs = pstmt.executeQuery();
			System.out.println("result: " + result);
			
			while(rs.next()) {
				vo2.setNum(rs.getInt("num"));
				vo2.setTitle(rs.getString("title"));
				vo2.setContent(rs.getString("content"));
				vo2.setName(rs.getString("name"));
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
	public ArrayList<Test13BoardVO> selectAll() {
		ArrayList<Test13BoardVO> vos = new ArrayList<Test13BoardVO>();

		try {
			conn = DriverManager.getConnection(Test13BoardDBInfo.URL, Test13BoardDBInfo.USER_ID, Test13BoardDBInfo.USER_PW);
			System.out.println("conn success...");
			String sql = "select * from board";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			System.out.println("result: " + rs);
			
			while(rs.next()) {
				Test13BoardVO vo = new Test13BoardVO();
				vo.setNum(rs.getInt("num"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setName(rs.getString("name"));
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
