package ex03;

public class ArrayEx01 {

	public static void main(String[] args) {
		//���ӵ� int�� �����ϴ� �迭 3,6,9
		int[] arr = {3,6,9};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);��Ÿ�� ���� ����ÿ� ����,out of bound
		
		int[]array = new int[3];//�迭���鶧 �ʿ��Ѱ� Ÿ��, Ÿ��ũ��,�����ּ�
		array[0] = 3;
		array[1] = 6;
		array[2] = 9;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		
	}

}
