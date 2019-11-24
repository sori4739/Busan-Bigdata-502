package ex03;

public class Bubble {

	public static void main(String[] args) {
		//10,5,2,8,1
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = 2;
	    arr[3] = 8;		
	    arr[4] = 1;
	    
	    int temp = arr[1];
	    arr[1] = arr[2];
	    arr[2] = temp;
	   
	    //오름차순으로 정렬해라.
	    temp = arr[0];
	    arr[0] = arr[4];
	    arr[4] = temp;
	    
	    System.out.println(arr[4]);
	    System.out.println(arr[3]);
	    System.out.println(arr[2]);
	    System.out.println(arr[1]);
	    System.out.println(arr[0]);
	    
	    
	}

}
