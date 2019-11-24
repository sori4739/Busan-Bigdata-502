package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private int id; // 시퀀스 번호
	private String username;
	private String password;
	private String name;
	private String email;
	private String phone;
	private java.sql.Timestamp creatDate;
	
}
