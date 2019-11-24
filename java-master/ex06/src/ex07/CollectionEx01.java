package ex07;

import java.util.ArrayList;

public class CollectionEx01 {

	public static void main(String[] args) {
		//배열 -> 컬렉션
		/**
		 * 이유
		 * 1.사이즈를 모를떄
		 * 2.추가하고 삭제하고 싶을떄
		 * ArrayList도 동기화를 지원하는 방법이 있다.
		 * List<String> synchronizedList = 
		 * 	    Collection.synchronizedList(new ArrayList<String>())
		 * 
		 */

			ArrayList<String> list = new ArrayList<String>();
			list.add("어거스트러쉬");
			list.add("쇼생크탈출");
			list.add("그녀");
			
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			System.out.println(list.get(2));
			
			list.remove(1);//2번지있는게 1번지로 들어간다
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			
			list.add(1, "쇼생크탈출");
			System.out.println("=============");
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			System.out.println(list.get(2));
			
			
			
	}

}
