package ex02;

public class OperatorEx02 {
	

	public static void main(String[] args) {
		//230�ʴ� ����̰� �����ΰ�
		int time = 230; //��
		int min = time / 60;
		System.out.println("�� : "+min); //���տ�����
		
		int sec = time - (min * 60);
		System.out.println("�� : "+sec);
		
		int sec2 = time % 60;
		System.out.println("�� : "+sec2);
	}
	
}
