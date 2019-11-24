package ex04;

public class Animal {
	//변수 = 상태 = 힙변수 = 전역변수
	String name;
	String type;
	int age;
	
	//메서드(함수) = 행동
	void speak() {
		//변수 = 지역변수 = 스택변수 = 함수호출이 종료될 때 사라짐.
		String sound = "어흥";
		System.out.println(sound);		
	}
	
	void eat() {
		System.out.println("먹다");
	}
}
