package ex03;

public class WhileEx01 {

	public static void main(String[] args) {
		
		boolean check = true;
		int num = 1;
		
		while(check) {
			System.out.println(num);
			num++; // num = num +1;
			
			if(num > 10) {
				break;//���� ���ΰ��ִ� ���� ����� �ݺ����� ����������.
			}
		}
		
		int i = 0;
		
		while(i<10) {
			System.out.println("i�� ���� : "+i);
			i++;
		}
		//10���� 0���� ����ϴ� while��
		int z  = 10;
			while(z >=0) {
				System.out.println("z�� ���� : "+z);
				z--;
			}
			
			
		
	}

}
