/**
 * 프로세스 => 단순히 실행중인 프로그램(메모리에 적재된 프로그램)
 * ex)크롬을 실행시키고 MP3음악을 듣고 있으면 프로세스가 2개!!
 * 쓰레드 : 프로세스 내에서 작업중인 조각들 !!
 * 하나의 프로세스에는 무조건 하나의 쓰레드가 존재함.
 * 프로그램은 이 쓰레드 위에서 실행됨.
 * 쓰레드가 두개를 가진 프로세스를 멀티스레드 프로세스라고 한다.
 * 
 * 쓰레드를 만드는 두가지 방법
 * 1.Thread를 상속하는방법 (자바는 다중상속이 되지 않는다.)
 * 2.Runnable 인터페이스를 구현하는 방법
 *
 *쓰레드를 만들때의 핵심
 *1.타겟을 만들어 주는 것 (타겟이란 run()메소드를 가진 클래스를 의미)
 *2.start()를 호출하면 run()이 실행된다는 것
 */
//Thread 상속에서 만들기
//FileDown f = new FileDown();
//f.start();
class FileDown extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("새로운 쓰레드 i : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

//Runnable 구현에서 만들어라
//Thread t1 = new Thread(new ImageDown());
//타겟의 타입이 Runnable 이기때문에 Runnable을 상속하면 Thread 객체를 만들고 타겟으로 넣는다.
//t1.start();
class ImageDown implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
}



public class MyThreadTest05 {

	public static void main(String[] args) {
		System.out.println("메인쓰레드1");
		FileDown f = new FileDown();
		f.start();
		System.out.println("메인쓰레드2");
		
		Thread t1 = new Thread(new ImageDown());
		t1.start();
		System.out.println("메인쓰레드3");
		
	}

}
