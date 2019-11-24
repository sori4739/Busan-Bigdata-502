package ex05;

class Person{
	void speck() {
		System.out.println("말하기");
	}
	void sleep() {
		System.out.println("잠자기");
	}
	void run() {
		System.out.println("달리기");
	}
//	void play() {
//		System.out.println("악기 연주하기");
//	}
}
class Student extends Person{
	void study() {
		System.out.println("공부하기");
	}
}

class StudentMusic extends Student {
	void play() {
		System.out.println("악기 연주하기");
	}
}


//재사용 -> 콤포지션
//타입을일치 -> 상속 -> 추상화
//다형성 Student => Person
public class AbstractApp {

	public static void main(String[] args) {
		//Person -> Student -> StudentMusic
		StudentMusic sm = new StudentMusic();
		sm.sleep();
		sm.run();
		sm.speck();
		sm.study();
		sm.play();
		
		//Person -> Student
		Student s =new Student();
		s.run();
		s.sleep();
		s.speck();
		s.study();
	}
}
