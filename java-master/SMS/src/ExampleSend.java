import java.util.HashMap;
import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

/**
 * @class ExampleSend
 * @brief This sample code demonstrate how to send sms through CoolSMS Rest API PHP
 */



public class ExampleSend {
	
	
	public static void smsSend(String msg,String to) {
		   String api_key = "NCSYKGROWYWMWTMC";
		    String api_secret = "JKGY2CVLYF1A5MBM8SWQXR0KL1EA2L5D";
		    Message coolsms = new Message(api_key, api_secret);

		    // 4 params(to, from, type, text) are mandatory. must be filled
		    HashMap<String, String> params = new HashMap<String, String>();
		    params.put("to", to);
		    params.put("from", "01066357922");//무조건 자기번호 (인증)
		    params.put("type", "SMS");
		    params.put("text", msg);
		    params.put("app_version", "test app 1.2"); // application name and version

		    try { 
		    	//send()함수는 메세지를 보내는 함수
		      JSONObject obj = (JSONObject) coolsms.send(params);
		      System.out.println(obj.toString());
		    } catch (CoolsmsException e) {
		      System.out.println(e.getMessage());
		      System.out.println(e.getCode());
		    }
	}
	
	
	
  public static void main(String[] args) {
	  smsSend("호호호", "01066357922");
  }
}