
class ThreadB extends Thread{
	int total;
	
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				
				System.out.println(i + "�� ���մϴ�.");
				total += i;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
		}
	} 
}


public class MyThreadTest07 {
	public static void main(String[] args) {
		ThreadB tb = new ThreadB();
		tb.start();
	
		synchronized (tb) {
			try {
				System.out.println("tb�� �Ϸ�ɶ����� ��ٸ��ϴ�.");
				tb.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Total : "+tb.total);
	
	}

}
