package ex05;

class Person{
	void speck() {
		System.out.println("���ϱ�");
	}
	void sleep() {
		System.out.println("���ڱ�");
	}
	void run() {
		System.out.println("�޸���");
	}
//	void play() {
//		System.out.println("�Ǳ� �����ϱ�");
//	}
}
class Student extends Person{
	void study() {
		System.out.println("�����ϱ�");
	}
}

class StudentMusic extends Student {
	void play() {
		System.out.println("�Ǳ� �����ϱ�");
	}
}


//���� -> ��������
//Ÿ������ġ -> ��� -> �߻�ȭ
//������ Student => Person
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
