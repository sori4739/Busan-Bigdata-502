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
		Animal a= d; // 묵시적 형변환 = 업캐스팅
		
		Dog d2 = (Dog)a; // 명시적 형변환 = 다운캐스팅
		

	}

}
