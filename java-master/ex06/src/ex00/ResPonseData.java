package ex00;

import java.util.ArrayList;
import java.util.List;

class Header{
	String resultCode;
	String resultMsg;
}
class Body{
	Items items;
	int numOfRows;
	int pageNo;
	int totalCount;
}
class Items{
	List<Item>item;
}
class Item{
	int baseDate;
	int baseTime;
	String category;
	int nx;
	int ny;
	double obsrValue;
}
class ResPonse{
	private Header header;
	private Body body;
	

	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
}

public class ResPonseData {
	ResPonse response;
	
	
	
	
	
}
