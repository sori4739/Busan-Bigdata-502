package ex04;

public class GarbageEx01 {

	public static void main(String[] args) {
		String a = new String("Good");//heap
		String b = new String("Bad");//heap
		String c = new String("Normal");//heap
		 
		//a -> 500번지 ->Good
		//b -> 700번지 ->Bad
		//c -> 800번지 ->Normal
		
		//레퍼런스 변수를 선언만 하면 초기값 null
		String d;
		String e;
		
		a =null;//a는 가비지컬렉션
		d =c;
		
		c =null; 
	}

}
