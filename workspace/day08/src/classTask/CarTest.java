package classTask;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car myCar = null;
		
		String name = null;
		int pw = 0, count = 0;
		int choice = 0;
		boolean exitFlag = false;
		
		System.out.println("자동차 한 대 뽑아야쥐~??");
		System.out.print("자동차 이름 >> ");
		name = sc.next();
		System.out.print("자동차 비밀번호 >> ");
		pw = sc.nextInt();
		
		myCar = new Car(name, pw);
		
		while(!exitFlag) {
			System.out.println("1. 문 열기\n2. 문 잠그기\n3. 시동 켜기\n4. 시동 끄기\n5. 종료");
			System.out.print("메뉴 입력 >> ");
			choice = sc.nextInt();
			
			if(choice == 5) {
				System.out.println("종료");
				break;
			}
			
			switch(choice) {
			case 1:
				if(myCar.door) {
					System.out.println("이미 열려 있습니다.");
				}
				else {
					
					for (int i = 0; i < 3; i++) {
						System.out.print(i+1+"번째 ");
						System.out.print("비밀번호 >> ");
						pw = sc.nextInt();
						if(myCar.openDoor(pw)) {
							System.out.println("오픈 성공!");
							break;
						}	
						count++;
					}
					
					if(count == 3) { // 비밀번호를 못 맞췄다.
						System.out.println("경찰 출동!");
						exitFlag = true;
					}
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("다시 입력하세요!");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
