package ex06;

class Factory{
	private String name;
	private String addr;
	
	public Factory(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	@Override
	public String toString() {
		String result = "name : "+name+", addr :"+addr;
		return result;
	}
}

public class ObjectEx03 {

	public static void main(String[] args) {
		Factory f = new Factory("삼성", "수원");
		System.out.println(f.toString());
		
		Factory f2 = new Factory("롯데", "부산");
		System.out.println(f2.toString());
		
		//1번 타입변환(String)
		String s = f.toString();
		System.out.println(s);
		
		int num = 10;
		String date = num+"";//int를 문자열과 결합 = String
		
		Integer sum = 100; //wrapper
		String data2 = sum.toString();
		System.out.println(data2);
		
		//2번 toString()을 오버라이딩해서 필드값을 한번에 알아볼때!!
		//객체를 호출 하면 자동으로 toString()을 호출한다.
		System.out.println(f);
	}

}
