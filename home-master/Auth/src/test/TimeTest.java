package test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

import org.junit.Test;

/**
 * java.sql.Date
 * java.sql.Time
 * java.util.Date
 * java.sql.Timestamp
 * java.time.LocalDate
 * java.time.LocalTime
 * java.time.LocalDateTime
 */

public class TimeTest {

	/**
	 * LocalDateTime 최근에 나와서 앞으로 가장 많이 사용할 타입.
	 */
	@Test
	public void localDate() {
		System.out.println("LocalDate : "+LocalDate.now());
	}
	
	@Test
	public void localTime() {
		System.out.println("LocalTime :"+LocalTime.now());
	}
	
	@Test
	public void localDateTime() {
		System.out.println("LocalDateTime :"+LocalDateTime.now());
	}
	
	@Test
	public void timeStamp() {
		Timestamp ts = new Timestamp(1);
		System.out.println("ts :"+ts);
	}
	@Test
	public void sqlTimeStampFormat() {
		SimpleDateFormat format1= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal.getTime : "+cal.getTime());
		String today = format1.format(cal.getTime());
		System.out.println(today+"=======");
		
		Timestamp ts2 = Timestamp.valueOf(today);
		
		System.out.println("timestamp : "+ts2 );
	}
}

