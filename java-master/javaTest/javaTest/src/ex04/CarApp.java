package ex04;

public class CarApp {

	public static void main(String[] args) {
		
		Car car = new Car("Ƽ��",1500,"������");
		System.out.println(car.getName());
		System.out.println(car.getPower());
		System.out.println(car.getType());
		System.out.println();
		
		Car c = new Car();
		c.setName("���");
		c.setPower(4000);
		c.setType("������ī");
		
		System.out.println(c.getName());
		System.out.println(c.getPower());
		System.out.println(c.getType());
		
		Car c2 = new Car();
		c2.setName("����");
		c2.setPower(2000);
		c2.setType("����");
		
		System.out.println(c2.getName());
		System.out.println(c2.getPower());
		System.out.println(c2.getType());
		
		Car c3 = new Car();
		c3.setName("��Ÿ��");
		c3.setPower(3000);
		c3.setType("suv");
		
		System.out.println(c3.getName());
		System.out.println(c3.getPower());
		System.out.println(c3.getType());
		
		
	}

}
