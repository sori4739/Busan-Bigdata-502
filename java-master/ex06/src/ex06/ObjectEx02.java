package ex06;

public class ObjectEx02 {

	public static void main(String[] args) {
		String[] phone = new String[3];
		
		phone[0] = "02-777-5656";
		phone[1] = "051-854-3232";
		phone[2] = "010-2222-7460";
		
		for (int i = 0; i < phone.length; i++) {
			//indexOf, subString을 통해서 자른다.
			int begin = phone[i].indexOf("-")+1;
			int last = phone[i].lastIndexOf("-");
			String center = phone[i].substring(begin,last);
			
			
			System.out.println(center);
		}
	}
}
