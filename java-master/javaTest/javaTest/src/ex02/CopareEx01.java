package ex02;

public class CopareEx01 {

	public static void main(String[] args) {
		int a =1;
		int b =2;
		boolean check = false;
		
		System.out.println(a==b);//����?
		System.out.println(a!=b);//�����ʳ�?, '!'�� ������ �ǹ�
		System.out.println(!check);
		System.out.println(!(a==b));
		
		System.out.println(a<b);//true
		System.out.println(a>b);//false
		
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
		
		//�������� &&(AND), ||(OR)
		System.out.println((a==b) ||(a<b));//true
		System.out.println(false || true);
		
		System.out.println((a==b) &&(a<b));//false
		System.out.println(false && true);
	}

}
