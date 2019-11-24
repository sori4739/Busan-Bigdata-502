
package busLine;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Body {

	@SerializedName("items")
	@Expose
	public Items items;

}

class Bus {

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

	@SerializedName("arsNo")
	@Expose
	public Integer arsNo;
	@SerializedName("bstopId")
	@Expose
	public Long bstopId;
	@SerializedName("bstopIdx")
	@Expose
	public Integer bstopIdx;
	@SerializedName("bustype")
	@Expose
	public String bustype;
	@SerializedName("gpsX")
	@Expose
	public Double gpsX;
	@SerializedName("gpsY")
	@Expose
	public Double gpsY;
	@SerializedName("lineNo")
	@Expose
	public Integer lineNo;
	@SerializedName("lineid")
	@Expose
	public Long lineid;
	@SerializedName("nodeNm")
	@Expose
	public String nodeNm;
	@SerializedName("carNo1")
	@Expose
	public Integer carNo1;
	@SerializedName("carNo2")
	@Expose
	public Integer carNo2;
	@SerializedName("lowplate1")
	@Expose
	public Integer lowplate1;
	@SerializedName("lowplate2")
	@Expose
	public Integer lowplate2;
	@SerializedName("min1")
	@Expose
	public Integer min1;
	@SerializedName("min2")
	@Expose
	public Integer min2;
	@SerializedName("station1")
	@Expose
	public Integer station1;
	@SerializedName("station2")
	@Expose
	public Integer station2;

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