package jsonex01;

import com.google.gson.Gson;

class Car{
	String carName;
	int power;
	//car에 대한 JSON
	//{"carName" : "아반떼" , "power" : 2000}
}

class Person{
	String name;
	int age;
	String addr;
	Car car;
	double eyes;
	//person에 대한 JSON타입
	//{"name" : "이름" , "age" : 50 , "addr" : "주소" , "car" :{"carName" : "아반떼" , "power" : 2000}, "eyes" : 0.6 }
}

public class JsonEx01 {

	public static void main(String[] args) {
		//JSON 데이터 타입은 어떻게 생겼는가?
		//{"Key" , value} <= JSON 오브젝트
		//value -> json, String, int , double , array
		//ex) {"name" : "이름" , "age" : 50 , "addr" : "주소"}
		
		Gson gson = new Gson();//역할 : 자바오브젝트 <--> JSON
		Car car = new Car();
		car.carName ="아반떼";
		car.power = 2000;
		//자바 오브젝트
		Person person = new Person();
		person.name = "홍길동";
		person.age = 50;
		person.addr = "조선";
		person.eyes = 1.5;
		person.car = car;
		
		//자바 오브젝트 => JSON으로 변경
		String jsonPerson = gson.toJson(person);
		System.out.println(jsonPerson);

		
		//JSON -> 통신으로 받았다 -> 자바오브젝트로 변경
		Person p = gson.fromJson(jsonPerson, Person.class);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.eyes);
		System.out.println(p.addr);
		
	}

}
