package ex06;

import java.util.HashMap;

public class WrapperEx02 {

	public static void main(String[] args) {
		String data = "�̸�:��ȣ��,�ݾ�:10000";//������� �̷� ���� ����
		
		HashMap<String, Integer> account = 
				new HashMap<String, Integer>();
		account.put("��ȣ��", 500000);
		account.put("�̼���", 300000);
		
		//Parsing (���� �м�)
		String parse[] = data.split(",");
		//parse.length ũ�Ⱑ 2
		System.out.println(parse[0]);
		System.out.println(parse[1]);
		
		String temp1[] = parse[0].split(":");//length = 2
		String temp2[] = parse[1].split(":");//length = 2
		
		String name = temp1[1];
		int money = Integer.parseInt(temp2[1]);
		
		System.out.println("name : "+name);
		System.out.println("money : "+money);
		System.out.println("��ȣ�� ���� : "+account.get("��ȣ��"));
		
		System.out.println(money + account.get("��ȣ��"));
		
		

	}

}
