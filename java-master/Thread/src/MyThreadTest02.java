
class Add2 extends Thread{
	
	//���ο� �������� ����
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("���ο���� i : "+ i);
			
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

	//���� �������� ����
	public static void main(String[] args) {
		System.out.println("���ξ����� ����");
		Add2 add2 = new Add2();
		add2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("���ξ����� i : "+ i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	}
}
