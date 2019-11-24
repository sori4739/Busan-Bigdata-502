import java.util.HashMap;

public class Util {
	public static HashMap<String, String> airLineID = new HashMap<String, String>();
	
	public static HashMap<String, String> airportID = new HashMap<String, String>();
	
	public static void airLineSet() {
		airLineID.put("아시아나항공", "AAR");
		airLineID.put("에어부산", "ABR");
		airLineID.put("이스타항공", "ESR");
		airLineID.put("제주항공", "JJA");
		airLineID.put("진 에어", "JNA");
		airLineID.put("대한 항공", "KAL");
		airLineID.put("티웨이항공", "TWB");
		
	}
	
	public static void airPortSet() {
		airportID.put("무안", "NAARKJB");
		airportID.put("광주", "NAARKJJ");
		airportID.put("여수", "NAARKJY");
		airportID.put("원주", "NAARKNW");
		airportID.put("양양", "NAARKNY");
		airportID.put("제주", "NAARKPC");
		airportID.put("김해", "NAARKPK");
		airportID.put("사천", "NAARKPS");
		airportID.put("울산", "NAARKPU");
		airportID.put("인천", "NAARKSI");
		airportID.put("김포", "NAARKSS");
		airportID.put("포항", "NAARKTH");
		airportID.put("대구", "NAARKTN");
		airportID.put("청주", "NAARKTU");
	}
}
