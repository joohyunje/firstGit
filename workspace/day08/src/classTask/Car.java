package classTask;

public class Car {
	String name;
	int pw;
	boolean door;
	boolean engine;
	
	
	public Car(String name, int pw) {
		this.name = name;
		this.pw = pw;
	}
	
	boolean openDoor(int pw) {
		if(this.pw == pw) {
			door = true;
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
