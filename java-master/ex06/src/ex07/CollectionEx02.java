package ex07;

import java.util.Vector;

public class CollectionEx02 {

	public static void main(String[] args) {
		//ArrayList�� ���̴� Vector�� ����ȭ�� �����Ѵ�.
		//ArrayList�� ����ȭ�� �����ϴ� ����� �ִ�.
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
		
		for (Integer i : vc) { //vc�� ũ�⸸ŭ ���ƿ�.
			System.out.println(i);
		}

	}

}
