package ex06;

public class ObjectEx05 {

	public static void main(String[] args) {
		
		String name = "����";
		//name = "������ ������"; 
		String name2 = "����";
		String name3 = new String("����");
		String name4 = new String("����");
		
		System.out.println(name.hashCode());//�ؽ��� �ּҰ� �ƴ� ���� ó���Ѵ�.
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());
		
		if(name3 == name4) {//�ּҺ�
			System.out.println("== ����");
		}
		
		if(name4.equals(name3)) {//�� ���� �� ! 
			System.out.println("equals() ����");
		}
	}

}
