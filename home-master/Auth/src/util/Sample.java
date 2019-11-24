package util;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Vector;

import models.Member;

public class Sample {

	public static Vector<String> getMemberName(){
		Vector<String> memberName = new Vector<>();
		memberName.add("ID");//½ÃÄö½º,±âº»Å°
		memberName.add("USERTNAME");
		memberName.add("PASSWORD");
		memberName.add("NAME");
		memberName.add("EMAIL");
		memberName.add("PHONE");
		memberName.add("CREATDATE");
		
		return memberName;
	}
	
	public static Vector<Member> getMembers(){
		Vector<Member> members = new Vector<>();
		members.add(new Member(1,"ssar","1234","È«±æµ¿","ssar@nate.com","01022228888",Time.localDateTimeToTimestamp(LocalDateTime.now())));
		members.add(new Member(2,"ssar","1234","È«±æµ¿","ssar@nate.com","01022228888",Time.localDateTimeToTimestamp(LocalDateTime.now())));
		members.add(new Member(3,"ssar","1234","È«±æµ¿","ssar@nate.com","01022228888",Time.localDateTimeToTimestamp(LocalDateTime.now())));
		members.add(new Member(4,"ssar","1234","È«±æµ¿","ssar@nate.com","01022228888",Time.localDateTimeToTimestamp(LocalDateTime.now())));
		members.add(new Member(5,"ssar","1234","È«±æµ¿","ssar@nate.com","01022228888",Time.localDateTimeToTimestamp(LocalDateTime.now())));
		members.add(new Member(6,"ssar","1234","È«±æµ¿","ssar@nate.com","01022228888",Time.localDateTimeToTimestamp(LocalDateTime.now())));
		members.add(new Member(7,"ssar","1234","È«±æµ¿","ssar@nate.com","01022228888",Time.localDateTimeToTimestamp(LocalDateTime.now())));
		members.add(new Member(8,"ssar","1234","È«±æµ¿","ssar@nate.com","01022228888",Time.localDateTimeToTimestamp(LocalDateTime.now())));
		members.add(new Member(9,"ssar","1234","È«±æµ¿","ssar@nate.com","01022228888",Time.localDateTimeToTimestamp(LocalDateTime.now())));
		members.add(new Member(10,"ssar","1234","È«±æµ¿","ssar@nate.com","01022228888",Time.localDateTimeToTimestamp(LocalDateTime.now())));
		
		return members;
	}
	
}
