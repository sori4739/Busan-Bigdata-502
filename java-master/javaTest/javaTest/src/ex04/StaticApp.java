package ex04;

class Person {
	String name;
	String eye; //빨간눈,노란눈.검정눈
	static String air = "공기";
}

public class StaticApp {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.eye ="빨간눈";
		
		Person p2 = new Person();
		p2.name = "장동건";
		p2.eye = "노란눈";
		
		System.out.println("p1 : "+p1.name+", "+p1.eye);
		System.out.println("p2 : "+p2.name+", "+p2.eye);
		
		//장동건의 눈색깔 변경
		p2.eye = "검정눈";
		System.out.println("눈 색깔 변경----");
		System.out.println("p1 : "+p1.name+", "+p1.eye);
		System.out.println("p2 : "+p2.name+", "+p2.eye);
		
		//공기를 연기로 변경
		//static의 값이 변경되면 heap에서도 변경된 static의 값을 쓸수있다.
		Person.air = "연기 ";
		System.out.println("공기 색깔 변경----");
		System.out.println("p1 : "+p1.name+", "+p1.eye+", "+Person.air);
		System.out.println("p2 : "+p2.name+", "+p2.eye+", "+Person.air);
		
		
	}

}
