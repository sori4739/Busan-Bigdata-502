import java.util.HashMap;

public class Util {
	public static HashMap<String, String> airLineID = new HashMap<String, String>();
	
	public static HashMap<String, String> airportID = new HashMap<String, String>();
	
	public static void airLineSet() {
		airLineID.put("�ƽþƳ��װ�", "AAR");
		airLineID.put("����λ�", "ABR");
		airLineID.put("�̽�Ÿ�װ�", "ESR");
		airLineID.put("�����װ�", "JJA");
		airLineID.put("�� ����", "JNA");
		airLineID.put("���� �װ�", "KAL");
		airLineID.put("Ƽ�����װ�", "TWB");
		
	}
	
	public static void airPortSet() {
		airportID.put("����", "NAARKJB");
		airportID.put("����", "NAARKJJ");
		airportID.put("����", "NAARKJY");
		airportID.put("����", "NAARKNW");
		airportID.put("���", "NAARKNY");
		airportID.put("����", "NAARKPC");
		airportID.put("����", "NAARKPK");
		airportID.put("��õ", "NAARKPS");
		airportID.put("���", "NAARKPU");
		airportID.put("��õ", "NAARKSI");
		airportID.put("����", "NAARKSS");
		airportID.put("����", "NAARKTH");
		airportID.put("�뱸", "NAARKTN");
		airportID.put("û��", "NAARKTU");
	}
}
