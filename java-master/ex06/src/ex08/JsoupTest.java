package ex08;
 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JsoupTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("<HTML>");
		
		sb.append("<HEAD>");
		sb.append("<TITLE>");
		sb.append("jsoup test");
		sb.append("</TITLE>");
		sb.append("<HEAD>");
		
		sb.append("<BODY>");
		sb.append("<div id='section'>");
		sb.append("<h2>Hello everyone</h2>");
		sb.append("</div>");
		sb.append("</BODY>");
		
		sb.append("</HTML>");
		
		System.out.println(sb.toString());
	}

}
