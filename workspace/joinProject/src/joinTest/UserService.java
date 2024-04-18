package joinTest;

import java.util.ArrayList;
import java.util.List;

public class UserService {
// 회원 정보를 담는 db역할을 하는 배열
	public static List<User> userList = new ArrayList<>();

// id 중복검사
// 리턴타입을 user
	public User checkId(String id) {
		for (User user : userList) {
			if (user.getId().equals(id)) { // 같은 아이디가 존재한다면 false
				return user;
			}
		}
		return null;
	}

// 비밀번호 검사
// 입력 받아온 pw가 배열 안에 있는 pw와 같다면

// 	review
//  원했던 모양은 직전 비밀번호로 변경이 불가능하게끔 만들고 싶었다.
//  이런 식으로 코드를 구성하게 된다면 다른 사람의 비밀번호로도 변경을 할 수 없게된다. 
//	
	public boolean checkPw(String pw) {
		for (User user : userList) {
			if (user.getPw().equals(pw)) { // 입력한 비밀번호와 배열 안에 있는 비밀번호가 같다면 for문 종료
				return false;
			}
		}
		return true;
	}

// 입력한 이름이 배열(db)에 존재하는지 확인
	public User checkName(String name) {
		for (User user : userList) {
			if (user.getName().equals(name)) { // 입력한 이름과 배열 안에 있는 이름이 같다면 for문 종료
				return user;
			}
		}
		return null;
	}

// 회원가입
	public void join(User user) {
		userList.add(user);
	}

// 로그인
// 매개변수: id, pw
	public String login(String id, String pw) {
		User loginUser = checkId(id);
		if (loginUser != null) { // 로그인을 할 수 있는 상태
			if (loginUser.getPw().equals(pw)) {
				return loginUser.getId();
			}
		}
		return null;
	}

// 내 정보 보기
	public void printData(User user) {
		System.out.println("id: " + user.getId());
		System.out.println("name: " + user.getName());
	}

// 이름 변경
	public void changeName(String loginId, String newName) {
		checkId(loginId).setName(newName);
	}

// 비밀번호 변경
	public boolean updatePw(User user, String pw) { // 현재 로그인 시도한 id,pw,name이 존재
		for (User u : userList) {
			if (u.getId().equals(user.getId())) {
				if (!u.getPw().equals(pw)) {
					user.setPw(pw);
					System.out.println("[변경한 비밀번호는 " + u.getPw() + "입니다.]");
					return false;
				} else {
					System.out.println("현재 비밀번호는 전 비밀번호와 동일합니다.");
				}
			}
		}
		return true;
	}

// 아이디 찾기 기능
	public boolean findId(User user) {
		if (user == null) {
			System.out.println("입력한 이름은 존재하지 않습니다.");
			return true;
		}
		for (User u : userList) {
			if (u.getName().equals(user.getName())) {
				System.out.println("[아이디는 " + u.getId() + "입니다.]");
				return false;
			}
		}
		return true;
	}

// 비밀번호 찾기 기능
	public boolean findPw(String id) {
		for (User u : userList) {
			if (u.getId().equals(id)) {
				System.out.println("[비밀번호는 " + u.getPw() + "입니다.]");
				return false;
			}
		}
		return true;
	}
}