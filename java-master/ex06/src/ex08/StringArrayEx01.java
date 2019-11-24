package ex08;

public class StringArrayEx01 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("안녕");
		sb.append("꺼져");
		sb.append("반가워");
		sb.append("밥먹었어?");
		
		sb.deleteCharAt(0);
		String s = sb.toString();
		System.out.println(s);
		
		
		//가독성 별로.
		String c = "안녕";
		c+="반가워";
		c+="밥먹었어?";
		System.out.println(c);
		
		//버퍼는 동기화 지원. = 임계구역생성 = 한명만 사용할 수 있음.
		//데이터에 신뢰성이 보장됨.
		//통신에 있어서는 스트링빌더 보다 버퍼를 써야한다.
		StringBuffer sbb = new StringBuffer();
		sbb.append("안녕");
		sbb.append("내일뭐해?");
		String dd = sbb.toString();
		System.out.println(dd);
		
		
		

	}

}
