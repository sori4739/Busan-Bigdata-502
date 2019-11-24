package ex07;

//if )통신으로 들어오는 데이터의 타입을 모를 때
//1 ) <T> 제네릭 문법 사용시 객체를 생성할 때 타입을 지정해주지 않으면 Object (단점 타입알고있어야 캐스팅할수있다)
class Movie<T, K>{
	T name;
	K rating;//평점
}

public class GenericEx01 {

	public static void main(String[] args) {
		Movie m = new Movie();
		m.name = "어거스트러쉬";
		m.rating = 9.0;
		
		System.out.println(m.name);
		System.out.println(m.rating);
		
		String name = (String)m.name;
		int rating = (int)m.rating;
		
		Movie<String, Double> movie = new Movie<>();
		movie.name = "어벤져스";
		movie.rating = 9.0;
	}

}
