import java.util.Calendar;

public class TestTimer {


	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
	}

}
