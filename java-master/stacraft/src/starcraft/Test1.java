package starcraft;

class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}

public class Test1 {

	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a= d; // ������ ����ȯ = ��ĳ����
		
		Dog d2 = (Dog)a; // ����� ����ȯ = �ٿ�ĳ����
		

	}

}
