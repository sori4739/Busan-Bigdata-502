package ex00;

//이미 구현되어 있는 것
interface Power{
	public abstract void on();
	public abstract void off();
}
//이미 구현되어 있는 것
class Tv{
	Power power;
	boolean state = false; //Tv가 off 된 상태

	//리스너 함수 생성
	//Power power = new LGRemocon();
	public void setOnClickListener(Power power) {
		this.power = power;
	}
	
	//콜백 함수
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

//내가 구현해야 하는 것(LG 리모콘을 만들기) Power 사용해
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
		
		//화웨이 리모콘
		tv.setOnClickListener(new Power() {

			@Override
			public void on() {
				System.out.println(" 화웨이 TV ON");
				
			}

			@Override
			public void off() {
				System.out.println(" 화웨이 TV OFF");
				
			}
			
		});
		
		tv.onButtonClick(); 
	}

}
