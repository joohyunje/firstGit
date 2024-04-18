package joinTest;

import java.util.Scanner;

//프로그램 관리 클래스         
public class UserController {
   private final Scanner sc = new Scanner(System.in);
   private UserService us = new UserService();
   private String loginId = null;

   public UserController() {
      play();

   }

   // 실질적인 메인함수
   private void play() {
      System.out.println("☆★커뮤니티에 오신 걸 환영합니다.☆★");

      while (true) {
         System.out.println("1. 회원가입 2. 로그인 3. 종료");
         int choice = sc.nextInt();

         switch (choice) {
         case 1: // 회원가입
            join();
            break;
         case 2: // 로그인
            login();
            break;
         case 3:
            System.out.println("프로그램 종료!");
            System.exit(0); // 프로그램 강제 종료
            break;
         default:
            System.out.println("번호 확인!");

         }

      }

   }

   private void join() {   
      String id = null;      
      String pw = null;         
      String name = null;      
      
      while (true) { // 중복되는 친구가 없을 때까지 계속 입력할 수 있도록         
         System.out.println("q <- 뒤로가기");         
         System.out.print("id: ");         
         id = sc.next();
         
         if (id.equals("q")) {         
            System.out.println("이전 화면으로!");         
            return;         
         }      
         
         if (us.checkId(id) == null) {
            break;      
         } else {
            System.out.println("이미 중복되는 아이디가 있습니다.");         
         }
         
      }               
         System.out.print("pw: ");         
         pw = sc.next();         
         System.out.print("name: ");         
         name = sc.next();
         
         us.join(new User(id, pw, name));      
         System.out.println("회원가입 완료!!");
         
   }

   private void login() {      
      loginPage(); // 로그인을 하기 전에 페이지 하나를 띄어서 어떤 것을 선택할지 결정하는 메소드         
      String id = null;
      String pw = null;         
      int cnt = 0;
            
      while (loginId == null) {         
         System.out.println("q <- 뒤로가기");         
         System.out.print("id: ");         
         id = sc.next();
         
         if (id.equals("q")) {         
            System.out.println("이전 화면으로!");         
            return;         
         }
                  
         for (int i = 0; i < 5; i++) { // 비밀번호 5번이상 틀릴 시 비밀번호 변경하게 하기         
            System.out.println("q <- 뒤로가기");         
            System.out.print("pw: ");         
            pw = sc.next();
            
            if (!us.checkPw(pw)) {            
               break;         
            }
         
            cnt++;         
         }
         
         if (cnt == 5) {         
            System.out.println("비밀번호를 5회 이상 틀렸어!");         
            System.out.println("비밀번호를 변경해줘");            
            updatePw(id);            
            return;         
         }
               
         if (id.equals("q")) {      
            System.out.println("이전 화면으로!");            
            return;         
         }
         
         
         loginId = us.login(id, pw); // id를 리턴 받아옴
         
         if (loginId == null) {   
            System.out.println("아이디 비밀번호 확인!");
         
         }
         
      }
         System.out.println(us.checkId(loginId).getName() + "님 환영합니다.");
         moveMyPage(); // 로그인이 성공하면 다른 페이지(?)를 보여주는 메소드
         
   }

   private void loginPage() {
      while (true) {
         System.out.println("1. 로그인 2. 아이디 찾기 3. 비밀번호 찾기");
         int choice = sc.nextInt();

         switch (choice) {
         case 1:
            System.out.println("로그인 창으로 갑니다.");
            return;
         case 2: // 아이디 찾기
            findId();
            break;
         case 3: // 비밀번호 찾기
            findPw();
            break;
         default:
            System.out.println("번호 확인!");
         }
      }
   }

   // 아이디 찾기
   private void findId() { // 회원가입 시 입력한 이름으로 찾기?
      String name = null;
      System.out.print("이름이 무엇인가요? ");
      name = sc.next();

      if (us.findId(us.checkName(name))) {
         findId(); // 재귀 호출
      }
   }

   // 비밀번호 찾기
   private void findPw() { // 회원가입 시 입력한 id로 찾기?
      String id = null;
      System.out.print("id: ");
      id = sc.next();

      if (us.findPw(id)) {
         System.out.println("입력한 id는 존재하지 않습니다.");
         findPw();
      }

   }

   private void moveMyPage() {
      while (true) {
         System.out.println("1. 마이페이지 2. 이름변경 3. 로그아웃");
         int choice = sc.nextInt();

         switch (choice) {
         case 1: // 마이페이지
            us.printData(us.checkId(loginId));
            break;
         case 2: // 이름 변경
            changeName();
            break;
         case 3: // 로그아웃
            System.out.println(us.checkId(loginId).getName() + "님 로그아웃 합니다.");
            
            return;
         default:
            System.out.println("번호 확인!");
         }
      }

   }

   private void changeName() {
      String newName = null;
      System.out.print("new Name: ");
      newName = sc.next();

      us.changeName(loginId, newName);

   }

   // 비밀번호 변경 기능 추가해보기
   private void updatePw(String id) { // 아이디를 매개변수로 가져와서 배열 안에 아이디가 존재하면 그 때 비밀번호를 가져오기      
      String newPw = null;         
      System.out.print("new Pw: ");         
      newPw = sc.next();
               
      //입력한 id에 대한 정보를 가져오겠지?   
      //만약 리턴값이 true라면 동일한 비밀번호를 입력 -> 자신 메소드 재실행
      if (us.updatePw(us.checkId(id), newPw)) {      
         updatePw(id);         
      }   
   }
}