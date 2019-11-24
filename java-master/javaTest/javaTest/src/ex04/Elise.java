package ex04;

//접근지정자
//public : 모든 패키지에서 접근 가능 ex)앨리스를 ex01에서 찾을수있다.
//private : 같은 클래스에서만 접근 가능
//디폴트 : 같은 패키지에서만 접근 가능
public class Elise {
	//객체지향에서는 변수에 private을 붙인다.변수는 행동을 통해 즉 함수를 통해 변경이되어야 하는데 직접접근하지 못하게 하기위해이다.
	final String name = "앨리스";
	private int height = 160;
	
	//객체지향에서는 행동에 public을 붙인다.(값을 변경)
	public void drink() {
		height = height - 30;
	}
	
	//값을 확인하는 메서드도 필요
	public int getHeight() {
		return height;
	}
}
