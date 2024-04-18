package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBConnection;
import vo.MemberVO;


public class MemberDAO {
	
	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;
	
	public List<MemberVO> selectAll(){
		String sql = "select * from tbl_member";
		
		List<MemberVO> memberList = new ArrayList<>();
		
		try {
			con = DBConnection.getConnection();
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				MemberVO member = new MemberVO();
				int i = 0;
				
				member.setMemberNumber(rs.getInt(1));
				member.setMemberId(rs.getString(2));
				member.setMemberPw(rs.getString(3));
				member.setMemberName(rs.getString(4));
				member.setMemberPhone(rs.getString(5));
				member.setMemberGender(rs.getString(6));
				
				memberList.add(member);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("selectAll() 도중 에러");
		} finally {
			try {
				DBConnection.close(con, pstm, rs);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("selectAll() 닫는 도중 에러");
			}
		}
		return memberList;
	}
	
	public int womanNumber() {
		int count = 0;
		String w = "W";
		
		String sql = "SELECT COUNT(MEMBER_ID)\r\n"
				+ "FROM TBL_MEMBER\r\n"
				+ "WHERE MEMBER_GENDER = ?";
		
		try {
			con = DBConnection.getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, w);
			rs = pstm.executeQuery();
			
			count = rs.getInt(1);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("womanNumber() 도중 에러");
		} finally {
			try {
				DBConnection.close(con, pstm, rs);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("womanNumber() 닫는 도중 에러");
			}
		}
		
		return count;
	}
	
}
