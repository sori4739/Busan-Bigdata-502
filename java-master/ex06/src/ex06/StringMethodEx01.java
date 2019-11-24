package ex06;

public class StringMethodEx01 {

	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "BCD";
		String s3 = "ABC";
		
		//int compareTo // 0 or 양수 or 음수
		int r1 =s1.compareTo(s3);
		System.out.println(r1);//0은 같다
		
		int r2 =s1.compareTo(s2);
		System.out.println(r2);
		
		//contains() 문자열 비교 true of false
		if(s1.contains(s3)) {
			System.out.println("같은 문자열입니다.");
		}
		//toLowerCase() 소문자로 변환
		String r3 =s1.toLowerCase();
		System.out.println(r3);
		
		//replace() 문자열 변환
		String r4 = s1.replace('A', 'F');
		System.out.println(r4);
		
		//subString() 문자열 자르기(시작 번지는 0이고, 끝은 직전 인덱스까지
		String r5 = s1.substring(0, 2);
		System.out.println(r5);
		
		String test1 = "동해물과 백두산이 마르고";//동해물과 백두산
		String r6 = test1.substring(0, 8);
		System.out.println(r6);
		
		//split() 특정 문자열로 나눔 return값이 배열(문자열)
	}

}
