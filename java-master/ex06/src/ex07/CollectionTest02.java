package ex07;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionTest02 {

	public static void main(String[] args) {
		//���ڿ��� ���� ������ ArrayList ����
		ArrayList<String> a = new ArrayList<String>();
		
		//Ű����� ���� 4���� �̸� �Է¹޾� ArrayList�� ����
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("�̸��� �Է��ϼ���>>");
			String name = sc.next();
			a.add(name);//ArrayList �÷��ǿ� ����
		}
		
		//ArrayList�� ��� �ִ� ��� �̸� ���
		int aSize = a.size();
		for (int i = 0; i < aSize; i++) {
			System.out.println(a.get(i)+" ");
		}
		
		//���� �� �̸� ���
		int longestIndex = 0; //���� ���� �� �̸��� �ִ� ArrayList �ε���
		for (int i = 1; i < aSize; i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) { //�̸� ���� ��
				longestIndex = i;// i��° �̸��� �� �� �̸���
			}
		}
		System.out.println("���� �� �̸��� :"+a.get(longestIndex));
		sc.close();

	}

}
