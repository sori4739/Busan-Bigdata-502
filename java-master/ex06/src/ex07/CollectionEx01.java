package ex07;

import java.util.ArrayList;

public class CollectionEx01 {

	public static void main(String[] args) {
		//�迭 -> �÷���
		/**
		 * ����
		 * 1.����� �𸦋�
		 * 2.�߰��ϰ� �����ϰ� ������
		 * ArrayList�� ����ȭ�� �����ϴ� ����� �ִ�.
		 * List<String> synchronizedList = 
		 * 	    Collection.synchronizedList(new ArrayList<String>())
		 * 
		 */

			ArrayList<String> list = new ArrayList<String>();
			list.add("��Ž�Ʈ����");
			list.add("���ũŻ��");
			list.add("�׳�");
			
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			System.out.println(list.get(2));
			
			list.remove(1);//2�����ִ°� 1������ ����
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			
			list.add(1, "���ũŻ��");
			System.out.println("=============");
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			System.out.println(list.get(2));
			
			
			
	}

}
