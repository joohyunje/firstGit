package inheritance;

import java.util.Scanner;

class Animals{
	String name;
	int age;
	String species;
	
	public Animals(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}

	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("종 : " + species);
	}
}

class SickAnimal extends Animals{
	String disease;
	
	public SickAnimal(String name, int age, String species, String disease) {
		super(name, age, species);
		this.disease = disease;
	}
	
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("병명 : " + disease);
	}
	
	void cure() {
		System.out.println(disease + "가 치료되었습니다.");
	}
}

public class Task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = null, species = null, disease = null;
		String check = null;
		int age = 0;
		Animals ani = null;
		SickAnimal s_ani = null;
		
		System.out.println("동물 정보를 입력하세요!");
		System.out.print("이름 >> ");
		name = sc.nextLine();
		
		System.out.print("나이 >> ");
		age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("종 >> ");
		species = sc.nextLine();
		
		System.out.println("동물이 아픈가요? Y/N");
		check = sc.nextLine();
		
		switch(check) {
		case "Y":
			System.out.print("병명 >> ");
			disease = sc.nextLine();			
			break;
		default:
			System.out.println("건강한 친구!");
			break;
		}
		
		if(disease == null) {
			ani = new Animals(name, age, species);
			ani.printInfo();
		}
		else {
			s_ani = new SickAnimal(name, age, species, disease);
			s_ani.printInfo();
			s_ani.cure();
		}
	}
}
