package ex04;
//Ŭ���� = ���赵
public class People {
	//�ʵ� , ��������, heap���� , ����
	private String name; //�̸�
	private String job; //����
	private int age; //����
	private String gender; //����
	private String blood; // ������
	
	
	
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

	//���� = �޼���
	public void eat() {
		System.out.println("�� �Ա�");
	}
	
	public void sleep() {
		System.out.println("�� �ڱ�");
	}
	
	public void speak() {
		System.out.println("���ϱ�");
	}
	
	public void walk() {
		System.out.println("�ȱ�");
	}
}
	