
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
		
		System.out.println("����");
		
		//���ξ����尡 ���ο� �������� ���ᶧ���� ��ٷȴٰ� ���εȴ�.
		//  ''  �� mp3�������� ���ᶧ���� ��ٷȴٰ� ����.
		try {
			mp3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("����");
	}

}
