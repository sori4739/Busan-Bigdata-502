
class Add{
	
	int num = 1;
	
	public void increase(){
			for (int i = 0; i < 10; i++) {
				System.out.println("num : "+num);
				num++;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//0.5초
			}
		}
	}
	
public class MyThreadTest {

	
	
	
	public static void main(String[] args) {
		Add add = new Add();
		System.out.println("메인쓰레드 1");
		add.increase();
		System.out.println("메인쓰레드 2");

	}

}
