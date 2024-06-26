package menu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import menu.MenuDTO;
import menu.MenuVO;
import util.DBConnection;

public class MenuDAO {
   
   private Connection con;
   private PreparedStatement pstm;
   private ResultSet rs;
   
//   전체 메뉴 정보 가져오는 기능을 가진 메소드
//   화면에 전체 메뉴를 출력하기 위해.
   public List<MenuDTO> selectAll(){
      
//	   실제로 날릴 sql, 쿼리문 변수에 저장.
//	   디비버 테스트 하고 그대로 붙여넣기 하면 편안.
      String sql = "SELECT MENU_NAME, \r\n"
            + "   MENU_PRICE \r\n"
            + "FROM TBL_MENU";
//    결과를 담아줄 변수 선언.
      List<MenuDTO> menuList = new ArrayList<>();
      
      try {
//    	  연력 객체 가져오기
    	  con = DBConnection.getConnection();
    	  
//        작성한 쿼리문, pstm 에 전달
    	  pstm = con.prepareStatement(sql);
//        쿼리 실행 -> 실행결과 rs 에 담기
    	  rs = pstm.executeQuery();
    	  
//         반복을 돌면서 해달 행 하나씩 가져오기.
         while(rs.next()) {
        	 // 컬럼의 이름으로 값을 가지고 올 수 있다.
            String name = rs.getString("menu_name");
            // 컬럼의 순번으로 값을 가지고 올 수 있다.
            int price = rs.getInt(2);
            
            menuList.add(new MenuDTO(name, price));
         }
         
      } catch (SQLException e) {
         System.out.println("selectAll() 에서 쿼리문 오류.");
      } finally {
         try {
        	 // 차례로 close
            DBConnection.close(con, pstm, rs);
         } catch (SQLException e) {
            System.out.println("selectAll() 도중, 닫을 때 에러");
         }
      }
      return menuList;
   }
   
//  메뉴 추가 이전에, 동일한 이름의 메뉴를 추가하는지를 검사. 중복검사.
   public boolean checkMenu(String name) {
	   
	   // 모든 메뉴 들고 오기.
	   List<MenuDTO> menuList = selectAll();
	   
	   for (MenuDTO menuDTO : menuList) {
		   if(menuDTO.getMenuName().equals(name) ) {
			   return true;
		   }
	   }
	   return false;
   }
   
   public int insert(MenuVO menuVO) {
	      
	      String sql = "INSERT INTO TBL_MENU\r\n"
	            + "(MENU_NUMBER, MENU_NAME, MENU_PRICE)\r\n"
	            + "VALUES(?, ?, ?)";
	      
	      int result = 0;
	      
	      try {
	         con = DBConnection.getConnection();
	         pstm = con.prepareStatement(sql);
	         
	         pstm.setInt(1, menuVO.getMenuNumber());
	         pstm.setString(2, menuVO.getMenuName());
	         pstm.setInt(3, menuVO.getMenuPrice());
	         
	         result = pstm.executeUpdate();
	         
	      } catch (SQLException e) {
	         System.out.println("insert 에서 쿼리문 에러");
	      } finally {
	         try {
	            DBConnection.close(con, pstm);
	         } catch (SQLException e) {
	            System.out.println("insert 닫는 도중 에러");
	         }
	      }
	      return result;
	   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}














