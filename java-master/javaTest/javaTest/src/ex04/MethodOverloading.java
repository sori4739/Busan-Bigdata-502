package ex04;

public class MethodOverloading {
	//오버로딩 쓰는 이유 호출할때 다양한 함수의 이름을 기억해야 하는데,편하게 하기위해
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
