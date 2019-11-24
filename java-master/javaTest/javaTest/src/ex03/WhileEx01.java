package ex03;

public class WhileEx01 {

	public static void main(String[] args) {
		
		boolean check = true;
		int num = 1;
		
		while(check) {
			System.out.println(num);
			num++; // num = num +1;
			
			if(num > 10) {
				break;//나를 감싸고있는 가장 가까운 반복문을 빠져나간다.
			}
		}
		
		int i = 0;
		
		while(i<10) {
			System.out.println("i의 값은 : "+i);
			i++;
		}
		//10부터 0까지 출력하는 while문
		int z  = 10;
			while(z >=0) {
				System.out.println("z의 값은 : "+z);
				z--;
			}
			
			
		
	}

}
