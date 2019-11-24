package ex04.a;

class Sample {
	public int a; //어느 패키지에서나 접근 가능
	private int b;//Sample 클래스에서만 접근가능
	int c;//디폴트 = 동일한 패키지에서만 접근가능
}

public class AccessEx01 {

	public static void main(String[] args) {
		Sample s =new Sample();
		s.a=10;
		s.c=20;
		//s.b찾을수 없음.

	}

}
