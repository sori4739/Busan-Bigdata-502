package ex07;

import java.util.HashMap;
import java.util.HashSet;

public class CollectionEx03 {

	public static void main(String[] args) {
		//HashMap, HashSet ������ : Ű ���� ���� ���� ã��.
		
		
		//���ӵ� ���� ������ �ƴ� . ������ �߰��� ������ ���� = ��ġ�̵��� ����
		//�˻��� ����.
		HashMap<String, Integer> info = new HashMap<String, Integer>();
		
		info.put("ssar", 1234);
		info.put("love", 3667);
		info.put("cos", 9999);
		
		System.out.println(info.get("love"));
		
		for (String key : info.keySet()) {//for each
			System.out.println("key : "+ key +" , value : "+ info.get(key));
		}
		
		HashSet<Integer> carNumber = new HashSet<Integer>();
		carNumber.add(1234);
		carNumber.add(5678);
		carNumber.add(5678);
		System.out.println("carNumber size : "+carNumber.size()); 
		
	}

}
