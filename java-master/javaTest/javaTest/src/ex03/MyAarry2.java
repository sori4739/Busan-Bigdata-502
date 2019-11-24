package ex03;

public class MyAarry2 {
	
	static void sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				myfrint(arr);
			}
			System.out.println("한 사이클 종료");
		}
	}
	static void myfrint(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {54,24,37,45,26};
		sort(arr);
		myfrint(arr);
	}

}
