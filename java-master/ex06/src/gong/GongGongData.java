
package gong;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Body {

	@SerializedName("items")
	@Expose
	public Items items;
	@SerializedName("numOfRows")
	@Expose
	public Integer numOfRows;
	@SerializedName("pageNo")
	@Expose
	public Integer pageNo;
	@SerializedName("totalCount")
	@Expose
	public Integer totalCount;

}

public class GongGongData {

	@SerializedName("response")
	@Expose
	public Response response;

}

class Header {

	@SerializedName("resultCode")
	@Expose
	public String resultCode;
	@SerializedName("resultMsg")
	@Expose
	public String resultMsg;

}

class Item {

	@SerializedName("baseDate")
	@Expose
	public Integer baseDate;
	@SerializedName("baseTime")
	@Expose
	public Integer baseTime;
	@SerializedName("category")
	@Expose
	public String category;
	@SerializedName("nx")
	@Expose
	public Integer nx;
	@SerializedName("ny")
	@Expose
	public Integer ny;
	@SerializedName("obsrValue")
	@Expose
	public Double obsrValue;

}

class Items {

	@SerializedName("item")
	@Expose
	public List<Item> item = null;

}

class Response {

	@SerializedName("header")
	@Expose
	public Header header;
	@SerializedName("body")
	@Expose
	public Body body;

}