package ex04;

public class PeopleApp {

	public static void main(String[] args) {
		People p  = new People(); //��ü�� ����� ��, �ν��Ͻ� ����
		p.setName("�ֽ���");
		p.setJob("�ǻ�");
		p.setAge(45);
		p.setGender("��");
		p.setBlood("A"); 
		
		System.out.println(p.getName());
		System.out.println(p.getJob());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getBlood());
		
		People p2  = new People();
		p2.setName("�̹̳�");
		p2.setJob("��������");
		p2.setAge(28);
		p2.setGender("��");
		p2.setBlood("O");
		
		System.out.println(p2.getName());
		System.out.println(p2.getJob());
		System.out.println(p2.getAge());
		System.out.println(p2.getGender());
		System.out.println(p2.getBlood());
		
		People p3  = new People();
		p3.setName("��̳�");
		p3.setJob("����");
		p3.setAge(47);
		p3.setGender("��");
		p3.setBlood("AB");
		
		System.out.println(p3.getName());
		System.out.println(p3.getJob());
		System.out.println(p3.getAge());
		System.out.println(p3.getGender());
		System.out.println(p3.getBlood());
		
	}

}
