package ex04;

public class MethodOverloading {
	//�����ε� ���� ���� ȣ���Ҷ� �پ��� �Լ��� �̸��� ����ؾ� �ϴµ�,���ϰ� �ϱ�����
	double getSum(int i,double j) {
		return i+j;
	}
	
	int getSum(int i,int j) {
		return i+j;
	}
	
	int getSum(int i,int j,int k) {
		return i+j+k;
	}
	
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		
		double i = mo.getSum(10,5.5);
		int j = mo.getSum(10,5);
		int k = mo.getSum(10, 5, 3);
		
		System.out.println("i :"+i);
		System.out.println("j :"+j);
		System.out.println("k :"+k);

	}

}
