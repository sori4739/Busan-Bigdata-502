import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Airplane {

   @SerializedName("response")
   @Expose
   public Response response;

}

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

class Header {

   @SerializedName("resultCode")
   @Expose
   public String resultCode;
   @SerializedName("resultMsg")
   @Expose
   public String resultMsg;

}

class Item {

   @SerializedName("airlineNm")
   @Expose
   public String airlineNm;
   @SerializedName("arrAirportNm")
   @Expose
   public String arrAirportNm;
   @SerializedName("arrPlandTime")
   @Expose
   public Long arrPlandTime;
   @SerializedName("depAirportNm")
   @Expose
   public String depAirportNm;
   @SerializedName("depPlandTime")
   @Expose
   public Long depPlandTime;
   @SerializedName("economyCharge")
   @Expose
   public Integer economyCharge;
   @SerializedName("prestigeCharge")
   @Expose
   public Integer prestigeCharge;
   @SerializedName("vihicleId")
   @Expose
   public String vihicleId;

}

class Items {

   @SerializedName("item")
   @Expose
   public List<Item>item;

}

class Response {

   @SerializedName("header")
   @Expose
   public Header header;
   @SerializedName("body")
   @Expose
   public Body body;

}