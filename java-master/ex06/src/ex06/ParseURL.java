package ex06;

public class ParseURL {
	String endpoint;
	String sid1;
	String oid;
	String aid;
	// 1�� : �Ľ�
	/**
	 * String endpoint = "https://news.naver.com/main/read.nhn";
	 * String sid1 = "100"; ���ڷ� �Ľ� 
	 * String oid = "011";
	 * String aid = "0003610015";
	 */
	// 2�� : sid1��?, oid��? , aid��? �м�
	public void parsing(String url) {
		String parse[] = url.split("\\?");
		String endPoint = parse[0];
		String temp[] = parse[1].split("\\&");

		String tempSid1[] = temp[0].split("\\=");
		sid1 = tempSid1[1];

		String tempOid[] = temp[1].split("\\=");
		oid = tempOid[1];

		String tempAid[] = temp[2].split("\\=");
		aid = tempAid[1];
		
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
		System.out.println("endPoint : " + endPoint);
		System.out.println("sid1 : " + sid1);
		System.out.println("oid : " + oid);
		System.out.println("aid : " + aid);
	}

	public static void main(String[] args) {
		String url = "https://news.naver.com/main/read.nhn?sid1=100&oid=011&aid=0003610015";
		ParseURL parseURL = new ParseURL();
		parseURL.parsing(url);
	}
}
