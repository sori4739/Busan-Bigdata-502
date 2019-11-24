package ex03;

import java.util.Scanner;

public class Page165 {

   
    void money(int coin, int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]+"원 :"+coin / arr[i]+"개");
         coin = coin % arr[i];
      }
    	
      
 }
   
   public static void main(String[] args) {
      int[] arr = {50000,10000,1000,500,100,50,10,1};
      Scanner sc = new Scanner(System.in);
      System.out.println("금액을 입력하세요 :");
      int coin = sc.nextInt();
      Page165 m = new Page165();
      m.money(coin, arr);
      
   }

}
