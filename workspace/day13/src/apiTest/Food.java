package apiTest;

/**
 * API 주석
 * 
 * @author Ryu hogeun
 * @since JDK 17
 * 
 * 주문 정보 객체를 만들어줄 클래스를 만듭니다.
 * 
 * String name : 음식명
 * int price : 개당 가격
 * int quantity : 주문 수량
 * 
 * Food() : 모든 데이터가 넘어와야지만 객체 생성 가능.
 * 겟터와 세터는 전부 있음.
 * 
 * printTotalPrice(int cost)
 * 
 * @param cost : 배달팁
 * 
 * @throws : 발생 가능한 예외 : 
 * */

public class Food {
	
	private String name;
	private int price;
	private int quantity;

	public Food(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void printTotalPrice(int cost) { // 배달팁
		System.out.println("총 주문 금액 : " + (price * quantity + cost) + "원");
	}

	
	
	
	
	
	
	
	

}
