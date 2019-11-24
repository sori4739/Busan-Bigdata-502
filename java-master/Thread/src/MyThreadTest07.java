
class ThreadB extends Thread{
	int total;
	
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				
				System.out.println(i + "를 더합니다.");
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
				System.out.println("tb가 완료될때까지 기다립니다.");
				tb.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Total : "+tb.total);
	
	}

}
