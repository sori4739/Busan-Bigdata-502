package ex04;

class Circle {
	int radius;//heap���� ���� = ��������
	
	
	//�������� = Circle�̶�� �����ڰ� ȣ��� ���� �޸� �ö��.
	//�����ڴ� ������ �� ����.�׷��Ƿ� ���� ������� ������ϳ�.�� ������ �ִ´�.
	//�ڹٴ� ������ �ִ� ������ ����.
	//this�� �ڱ� �ڽ��� ��ü
	//��ü�� Object(Ŭ����)�� new�� ��.
	public Circle(int radius) {
		this.radius = radius;
	}
}

//�ּҸ� ����
public class ReferencePassing {
	
	//Circle c�� increase�Լ��� ������ �ִ� ��������
	static void increase(Circle c) {
		c.radius ++;
	}
	//Circle circle�� main �Լ��� ������ �ִ� ��������
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		increase(circle);//�ּҸ� �ѱ�
		System.out.println("radius : "+circle.radius);

	}

}
