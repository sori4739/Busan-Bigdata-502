package jsonex01;

import com.google.gson.Gson;

class Car{
	String carName;
	int power;
	//car�� ���� JSON
	//{"carName" : "�ƹݶ�" , "power" : 2000}
}

class Person{
	String name;
	int age;
	String addr;
	Car car;
	double eyes;
	//person�� ���� JSONŸ��
	//{"name" : "�̸�" , "age" : 50 , "addr" : "�ּ�" , "car" :{"carName" : "�ƹݶ�" , "power" : 2000}, "eyes" : 0.6 }
}

public class JsonEx01 {

	public static void main(String[] args) {
		//JSON ������ Ÿ���� ��� ����°�?
		//{"Key" , value} <= JSON ������Ʈ
		//value -> json, String, int , double , array
		//ex) {"name" : "�̸�" , "age" : 50 , "addr" : "�ּ�"}
		
		Gson gson = new Gson();//���� : �ڹٿ�����Ʈ <--> JSON
		Car car = new Car();
		car.carName ="�ƹݶ�";
		car.power = 2000;
		//�ڹ� ������Ʈ
		Person person = new Person();
		person.name = "ȫ�浿";
		person.age = 50;
		person.addr = "����";
		person.eyes = 1.5;
		person.car = car;
		
		//�ڹ� ������Ʈ => JSON���� ����
		String jsonPerson = gson.toJson(person);
		System.out.println(jsonPerson);

		
		//JSON -> ������� �޾Ҵ� -> �ڹٿ�����Ʈ�� ����
		Person p = gson.fromJson(jsonPerson, Person.class);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.eyes);
		System.out.println(p.addr);
		
	}

}
