package ex04;

class Circle {
	int radius;//heap에서 관리 = 전역변수
	
	
	//지역변수 = Circle이라는 생성자가 호출될 때만 메모리 올라옴.
	//생성자는 리턴할 수 없다.그러므로 값을 남기려면 방법은하나.힙 변수에 넣는다.
	//자바는 가까이 있는 변수를 따라감.
	//this는 자기 자신의 객체
	//객체는 Object(클래스)를 new한 것.
	public Circle(int radius) {
		this.radius = radius;
	}
}

//주소를 전달
public class ReferencePassing {
	
	//Circle c는 increase함수가 가지고 있는 지역변수
	static void increase(Circle c) {
		c.radius ++;
	}
	//Circle circle은 main 함수가 가지고 있는 지역변수
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		increase(circle);//주소를 넘김
		System.out.println("radius : "+circle.radius);

	}

}
