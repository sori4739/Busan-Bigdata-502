
class MP3Download extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("MP3Download : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class MyThreadTest06 {

	public static void main(String[] args) {
		MP3Download mp3 = new MP3Download();
		mp3.start();
		
		System.out.println("시작");
		
		//메인쓰레드가 새로운 쓰레드의 종료때까지 기다렸다가 조인된다.
		//  ''  가 mp3쓰레드의 종료때까지 기다렸다가 조인.
		try {
			mp3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

}
