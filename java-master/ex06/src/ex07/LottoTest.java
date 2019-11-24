package ex07;

import java.util.HashSet;
import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		Random r = new Random();
		while(true) {
			int value = r.nextInt(45)+1;
			lotto.add(value);
			
			if(lotto.size()==6) {
				break;
			}
		}
		
		for (Integer i : lotto) {
			System.out.print(i+" ");
		}

	}

}
