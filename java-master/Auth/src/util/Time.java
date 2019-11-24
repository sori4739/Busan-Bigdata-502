package util;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Time {
	//LocalDateTime => Timestamp
	public static Timestamp localDateTimeToTimestamp(LocalDateTime ldt) {
		return Timestamp.valueOf(ldt);
	}
	
	//Timestamp => LocalDateTime
	public static LocalDateTime timestampToLocalDateTime(Timestamp ts) {
		return ts.toLocalDateTime();
	}
	
}
