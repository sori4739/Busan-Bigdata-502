
class MultiDownload{



//1번 쓰레드를 상속
//2번 Runnable을 구현
class Download extends MultiDownload implements Runnable{
	
	@Override
	public void run() {
		down();
		
	}
	
	
	public void down() {
		for (int i = 1; i < 101; i++) {
			System.out.println(i+"% 다운 중");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



//public class MyThreadTest03 {
//
//	public static void main(String[] args) {
//		//run을 가지고 있는 클래스를 타겟이라고 한다.
//		Thread t1 = new Thread(new Download());
//		t1.start();
//		System.out.println("다운로드 종료");
//
//	}
//}

}
