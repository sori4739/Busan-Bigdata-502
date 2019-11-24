package ex06;

public class ObjectEx01 {

	public static void main(String[] args) {
		String name = "동물동동";
		int num = name.indexOf('동');
		System.out.println(num);
		
		int num2 = name.indexOf('동', 2);
		System.out.println(num2);
		
		int num3 = name.lastIndexOf("동");
		System.out.println(num3);
		
		
		char c = name.charAt(1);
		System.out.println(c);
		
		String phone = "010-2222-7460";
		String phone2 = "051-333-9878";
		
		int firstIndex = phone.lastIndexOf("-")+1;
		String lastPhone = phone.substring(firstIndex);
		System.out.println(lastPhone);
		
		boolean check = phone.contains("4");
		System.out.println(check);
		
		String result = phone.substring(9);
		System.out.println(result);
		
		String result2 = phone.substring(9,11);
		System.out.println(result2);
	}

}
