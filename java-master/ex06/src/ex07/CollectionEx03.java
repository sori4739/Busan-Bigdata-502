package ex07;

import java.util.HashMap;
import java.util.HashSet;

public class CollectionEx03 {

	public static void main(String[] args) {
		//HashMap, HashSet 공통점 : 키 값을 통해 값을 찾음.
		
		
		//연속된 저장 구조가 아님 . 삭제와 추가에 굉장히 용이 = 위치이동이 없음
		//검색도 빠름.
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
