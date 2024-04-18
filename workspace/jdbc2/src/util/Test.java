package util;

import java.sql.Connection;
import java.util.List;

import menu.MenuDTO;
import menu.MenuVO;
import menu.dao.MenuDAO;

public class Test {
	public static void main(String[] args) {
			
		Connection connection = DBConnection.getConnection();
		
//		menuDAO -> selectAll() 테스트
		menu.dao.MenuDAO MD = new menu.dao.MenuDAO();
		
		List<MenuDTO> list = MD.selectAll();
		
		System.out.println(list);
		
		if(MD.insert(new MenuVO(4, "녹차프라푸치노", 4500)) == 1) {
			System.out.println("추가 성공");
		}
		
		list = MD.selectAll();
		System.out.println(list);
					
	}
}
