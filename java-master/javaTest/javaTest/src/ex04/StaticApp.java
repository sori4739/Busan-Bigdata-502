package ex04;

class Person {
	String name;
	String eye; //������,�����.������
	static String air = "����";
}

public class StaticApp {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "ȫ�浿";
		p1.eye ="������";
		
		Person p2 = new Person();
		p2.name = "�嵿��";
		p2.eye = "�����";
		
		System.out.println("p1 : "+p1.name+", "+p1.eye);
		System.out.println("p2 : "+p2.name+", "+p2.eye);
		
		//�嵿���� ������ ����
		p2.eye = "������";
		System.out.println("�� ���� ����----");
		System.out.println("p1 : "+p1.name+", "+p1.eye);
		System.out.println("p2 : "+p2.name+", "+p2.eye);
		
		//���⸦ ����� ����
		//static�� ���� ����Ǹ� heap������ ����� static�� ���� �����ִ�.
		Person.air = "���� ";
		System.out.println("���� ���� ����----");
		System.out.println("p1 : "+p1.name+", "+p1.eye+", "+Person.air);
		System.out.println("p2 : "+p2.name+", "+p2.eye+", "+Person.air);
		
		
	}

}
