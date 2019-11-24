package ex02;
//여러가지 변수를 묶으려면 클래스(class)를 붙여야한다.
class People{
	static int age = 35;
	static String name = "최주호";
	static String email = "ssar@nate.com";
	static char gender = '남';
}





public class ReferenceEx02 {

	public static void main(String[] args) {
	
		System.out.println(People.age);
		System.out.println(People.email);
		System.out.println(People.gender);
		System.out.println(People.name);
		
		
	}

}
//자바는 static을 찾는다. static이라고 적힌것은 메모리 (램)에 올린다. static은 시작 때부터 메모리에 올라가고 메인이 끝날때 같이 메모리에서 삭제된다.
//static을찾아 메모리에 올린후 main을 찾는다.
//main을 실행 한다.
//자바의 모든것은 클래스 안에 있어야 한다.
//자바는 main()에서 시작해서 main()에서 끝난다.
//결과 값은 메인안에 있어야 값이 출력이된다 . 메인안에 있어야 메모리에서 실행되기때문.
//함수 뒤 중괄호 안 = stack
//Heap=클래스 네임(커스텀 자료)을 타입으로 두고 변수를 설정한뒤 = new 타입(); = 메모리에 내가 원할때 올리고 버릴수있다는 장점.