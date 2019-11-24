package ex04;

public class PeopleApp {

	public static void main(String[] args) {
		People p  = new People(); //객체를 만드는 것, 인스턴스 생성
		p.setName("최승희");
		p.setJob("의사");
		p.setAge(45);
		p.setGender("여");
		p.setBlood("A"); 
		
		System.out.println(p.getName());
		System.out.println(p.getJob());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getBlood());
		
		People p2  = new People();
		p2.setName("이미녀");
		p2.setJob("골프선수");
		p2.setAge(28);
		p2.setGender("여");
		p2.setBlood("O");
		
		System.out.println(p2.getName());
		System.out.println(p2.getJob());
		System.out.println(p2.getAge());
		System.out.println(p2.getGender());
		System.out.println(p2.getBlood());
		
		People p3  = new People();
		p3.setName("김미남");
		p3.setJob("교수");
		p3.setAge(47);
		p3.setGender("남");
		p3.setBlood("AB");
		
		System.out.println(p3.getName());
		System.out.println(p3.getJob());
		System.out.println(p3.getAge());
		System.out.println(p3.getGender());
		System.out.println(p3.getBlood());
		
	}

}
