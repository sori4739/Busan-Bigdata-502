package ex03;

public class ArrayEx01 {

	public static void main(String[] args) {
		//연속된 int를 저장하는 배열 3,6,9
		int[] arr = {3,6,9};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);런타임 오류 실행시에 오류,out of bound
		
		int[]array = new int[3];//배열만들때 필요한것 타입, 타입크기,시작주소
		array[0] = 3;
		array[1] = 6;
		array[2] = 9;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		
	}

}
