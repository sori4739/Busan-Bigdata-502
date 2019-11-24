package ex00;

//�̹� �����Ǿ� �ִ� ��
interface Power{
	public abstract void on();
	public abstract void off();
}
//�̹� �����Ǿ� �ִ� ��
class Tv{
	Power power;
	boolean state = false; //Tv�� off �� ����

	//������ �Լ� ����
	//Power power = new LGRemocon();
	public void setOnClickListener(Power power) {
		this.power = power;
	}
	
	//�ݹ� �Լ�
	public void onButtonClick() {
		if(state) {
			state = false;
			power.off();
		}else {
			state = true;
			power.on();
		}
	}
}

//���� �����ؾ� �ϴ� ��(LG �������� �����) Power �����
class LGRemocon implements Power{

	@Override
	public void on() {
		System.out.println("LG TV ON");
	}

	@Override
	public void off() {
		System.out.println("LG TV OFF");
	}
	
}

class SamsungRemocon implements Power {

	@Override
	public void on() {
		System.out.println(" Samsung TV ON");
		
	}

	@Override
	public void off() {
		System.out.println(" Samsung TV OFF");
		
	}
	
}

public class CallBackTest {

	public static void main(String[] args) {
		Tv tv = new Tv();
		LGRemocon lgremocon = new LGRemocon();
		
		tv.setOnClickListener(lgremocon);
		
		tv.onButtonClick();
		tv.onButtonClick();
		tv.onButtonClick();
		
		SamsungRemocon samsungremocon = new SamsungRemocon();
		
		tv.setOnClickListener(samsungremocon);
		
		tv.onButtonClick();
		tv.onButtonClick();
		tv.onButtonClick();
		
		//ȭ���� ������
		tv.setOnClickListener(new Power() {

			@Override
			public void on() {
				System.out.println(" ȭ���� TV ON");
				
			}

			@Override
			public void off() {
				System.out.println(" ȭ���� TV OFF");
				
			}
			
		});
		
		tv.onButtonClick(); 
	}

}
