
class Add2 extends Thread{
	
	//새로운 쓰레드의 스택
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("새로운쓰레드 i : "+ i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class MyThreadTest02 {

	//메인 쓰레드의 스택
	public static void main(String[] args) {
		System.out.println("메인쓰레드 시작");
		Add2 add2 = new Add2();
		add2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("메인쓰레드 i : "+ i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	}
}
