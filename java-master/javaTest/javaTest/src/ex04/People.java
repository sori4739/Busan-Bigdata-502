package ex04;
//클래스 = 설계도
public class People {
	//필드 , 전역변수, heap변수 , 상태
	private String name; //이름
	private String job; //직업
	private int age; //나이
	private String gender; //성별
	private String blood; // 혈액형
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	//행위 = 메서드
	public void eat() {
		System.out.println("밥 먹기");
	}
	
	public void sleep() {
		System.out.println("잠 자기");
	}
	
	public void speak() {
		System.out.println("말하기");
	}
	
	public void walk() {
		System.out.println("걷기");
	}
}
	