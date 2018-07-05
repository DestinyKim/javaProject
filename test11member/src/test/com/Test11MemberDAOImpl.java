package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test11MemberDAOImpl implements Test11MemberDAO {
	
	private int result = 0;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public Test11MemberDAOImpl() {
		try {
			// 예외처리: try - catch
			// 예외전가: throws
			Class.forName(Test11MemberDBInfo.DRIVER_NAME);
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			System.out.println("driver failed...");
			e.printStackTrace();

		}
	}
	
	@Override
	public int insert(Test11MemberVO vo) {

		try {
			conn = DriverManager.getConnection(Test11MemberDBInfo.URL,Test11MemberDBInfo.USER_ID,Test11MemberDBInfo.USER_PW);
			System.out.println("conn successed...");
			
			String sql = "insert into member(num,id,pw,name,tel) values(seq1.nextval,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getTel());
	
		result = pstmt.executeUpdate();
			System.out.println("result: " + result);

		} catch (SQLException e) {
			System.out.println("pstmt failed...");
			e.printStackTrace();
		} finally {
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

		return result;
	}

	@Override
	public int update(Test11MemberVO vo) {

		try {
			conn = DriverManager.getConnection(Test11MemberDBInfo.URL,Test11MemberDBInfo.USER_ID,Test11MemberDBInfo.USER_PW);
			System.out.println("conn successed...");
			
			String sql = "update member set id = ?, pw = ?, name = ?, tel = ? Where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getTel());
			pstmt.setInt(5, vo.getNum());
	
		result = pstmt.executeUpdate();
			System.out.println("result: " + result);

		} catch (SQLException e) {
			System.out.println("pstmt failed...");
			e.printStackTrace();
		} finally {
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

		return result;
	}

	@Override
	public int delete(Test11MemberVO vo) {

		try {
			conn = DriverManager.getConnection(Test11MemberDBInfo.URL,Test11MemberDBInfo.USER_ID,Test11MemberDBInfo.USER_PW);
			System.out.println("conn successed...");
			
			String sql = "delete from member where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getNum());
	
		result = pstmt.executeUpdate();
			System.out.println("result: " + result);

		} catch (SQLException e) {
			System.out.println("pstmt failed...");
			e.printStackTrace();
		} finally {
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

		return result;
	}

	@Override
	public Test11MemberVO selectOne(Test11MemberVO vo) {
		Test11MemberVO vo2 = new Test11MemberVO();

		try {
			conn = DriverManager.getConnection(Test11MemberDBInfo.URL,Test11MemberDBInfo.USER_ID,Test11MemberDBInfo.USER_PW);
			System.out.println("conn successed...");
			
			String sql = "select * from member where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getNum());
	
			rs = pstmt.executeQuery();
			System.out.println("result: " + rs);
			while(rs.next()) {
				vo2.setNum(rs.getInt("num"));
				vo2.setId(rs.getString("id"));
				vo2.setPw(rs.getString("pw"));
				vo2.setName(rs.getString("name"));
				vo2.setTel(rs.getString("tel"));
			}

		} catch (SQLException e) {
			System.out.println("pstmt failed...");
			e.printStackTrace();
		} finally {
			if (rs != null) {
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

		return vo2;
	}

	@Override
	public ArrayList<Test11MemberVO> selectAll() {
		ArrayList<Test11MemberVO> vos = new ArrayList<Test11MemberVO>();
		
				try {
					conn = DriverManager.getConnection(Test11MemberDBInfo.URL,Test11MemberDBInfo.USER_ID,Test11MemberDBInfo.USER_PW);
					System.out.println("conn successed...");
					
					String sql = "select * from member";
					pstmt = conn.prepareStatement(sql);

					rs = pstmt.executeQuery();
					System.out.println("result: " + rs);
					while(rs.next()) {
						Test11MemberVO vo = new Test11MemberVO();
						vo.setNum(rs.getInt("num"));
						vo.setId(rs.getString("id"));
						vo.setPw(rs.getString("pw"));
						vo.setName(rs.getString("name"));
						vo.setTel(rs.getString("tel"));
						vos.add(vo);
					}
				} catch (SQLException e) {
					System.out.println("pstmt failed...");
					e.printStackTrace();
				} finally {
					if (rs != null) {
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
