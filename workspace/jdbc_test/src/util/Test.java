package util;

import java.sql.Connection;
import java.util.List;

import dao.MemberDAO;
import vo.MemberVO;


public class Test {
	public static void main(String[] args) {
		
		MemberDAO memberDAO = new MemberDAO();
		
		Connection con = DBConnection.getConnection();
		
		List<MemberVO> memberList = memberDAO.selectAll();
		System.out.println(memberList);
		
		System.out.println(memberDAO.womanNumber());
		
	}
}













