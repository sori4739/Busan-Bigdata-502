package ex03;

public class MyArray {

	static void sort(int[] arr) {//���� ����
		for (int i = 0; i < arr.length-1; i++) {//����Ŭ
			for (int j = 0; j < arr.length-1-i; j++) {//��,����
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				myPrint(arr);
			}
			System.out.println("�� ����Ŭ ����");
			
		}
	}
	
	static void myPrint(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {2,4,11,8,7};
		//MyArray.sort(arr);
		sort(arr);
		myPrint(arr);
		
		
		//myPrint(arr);
		
	}

}
