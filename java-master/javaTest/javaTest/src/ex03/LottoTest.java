package ex03;

import java.util.Random;

public class LottoTest {
   
   static void play(int[] myLotto) {
      int[] lotto = new int[6];
      Random r = new Random();
      
      for (int i = 0; i < lotto.length; i++) {
         lotto[i] = r.nextInt(45)+1;
         //동일한 것이 있는지 검사
         for (int j = 0; j < i; j++) {
            if(lotto[i] == lotto[j]) {
               i--;
               break;
            }
         }
      }
      
      MyArray.sort(lotto);
      boolean check= false;
      for (int i = 0; i < lotto.length; i++) {
         if(lotto[i] != myLotto[i]) {
            check = true;
         }
      }
      if(check) {
         System.out.println("꽝");
      }
      else {
    	  System.out.println();
      }
   }

   public static void main(String[] args) {
      int[] myLotto = {3, 15, 18, 22, 29, 43};

      play(myLotto);
      
      
   }

}