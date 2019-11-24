package ex07;

import java.util.Vector;

public class CollectionEx02 {

	public static void main(String[] args) {
		//ArrayList와 차이는 Vector는 동기화를 지원한다.
		//ArrayList도 동기화를 지원하는 방법이 있다.
		//List<String> synchronizedList = 
		//  Collection.synchronizedList(new ArrayList<String>())
		Vector<Integer> vc = new Vector<Integer>();
		vc.add(1);
		vc.add(2);
		vc.add(3);
		
		int vcSize = vc.size();
		for (int i = 0; i < vcSize; i++) {
			System.out.println(vc.get(i));
		}
		
		for (Integer i : vc) { //vc의 크기만큼 돌아요.
			System.out.println(i);
		}

	}

}
