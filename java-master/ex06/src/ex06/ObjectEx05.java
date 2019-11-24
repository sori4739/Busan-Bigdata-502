package ex06;

public class ObjectEx05 {

	public static void main(String[] args) {
		
		String name = "동물";
		//name = "동물은 강아지"; 
		String name2 = "동물";
		String name3 = new String("동물");
		String name4 = new String("동물");
		
		System.out.println(name.hashCode());//해쉬는 주소가 아닌 값을 처리한다.
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());
		
		if(name3 == name4) {//주소비교
			System.out.println("== 같다");
		}
		
		if(name4.equals(name3)) {//값 까지 비교 ! 
			System.out.println("equals() 같다");
		}
	}

}
