/**
 * ���μ��� => �ܼ��� �������� ���α׷�(�޸𸮿� ����� ���α׷�)
 * ex)ũ���� �����Ű�� MP3������ ��� ������ ���μ����� 2��!!
 * ������ : ���μ��� ������ �۾����� ������ !!
 * �ϳ��� ���μ������� ������ �ϳ��� �����尡 ������.
 * ���α׷��� �� ������ ������ �����.
 * �����尡 �ΰ��� ���� ���μ����� ��Ƽ������ ���μ������ �Ѵ�.
 * 
 * �����带 ����� �ΰ��� ���
 * 1.Thread�� ����ϴ¹�� (�ڹٴ� ���߻���� ���� �ʴ´�.)
 * 2.Runnable �������̽��� �����ϴ� ���
 *
 *�����带 ���鶧�� �ٽ�
 *1.Ÿ���� ����� �ִ� �� (Ÿ���̶� run()�޼ҵ带 ���� Ŭ������ �ǹ�)
 *2.start()�� ȣ���ϸ� run()�� ����ȴٴ� ��
 */
//Thread ��ӿ��� �����
//FileDown f = new FileDown();
//f.start();
class FileDown extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("���ο� ������ i : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

//Runnable �������� ������
//Thread t1 = new Thread(new ImageDown());
//Ÿ���� Ÿ���� Runnable �̱⶧���� Runnable�� ����ϸ� Thread ��ü�� ����� Ÿ������ �ִ´�.
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
		System.out.println("���ξ�����1");
		FileDown f = new FileDown();
		f.start();
		System.out.println("���ξ�����2");
		
		Thread t1 = new Thread(new ImageDown());
		t1.start();
		System.out.println("���ξ�����3");
		
	}

}
