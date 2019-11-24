package ex07;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionTest02 {

	public static void main(String[] args) {
		//문자열만 삽입 가능한 ArrayList 생성
		ArrayList<String> a = new ArrayList<String>();
		
		//키보드로 부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String name = sc.next();
			a.add(name);//ArrayList 컬렉션에 삽입
		}
		
		//ArrayList에 들어 있는 모든 이름 출력
		int aSize = a.size();
		for (int i = 0; i < aSize; i++) {
			System.out.println(a.get(i)+" ");
		}
		
		//가장 긴 이름 출력
		int longestIndex = 0; //현재 가장 긴 이름이 있는 ArrayList 인덱스
		for (int i = 1; i < aSize; i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) { //이름 길이 비교
				longestIndex = i;// i번째 이름이 더 긴 이름임
			}
		}
		System.out.println("가장 긴 이름은 :"+a.get(longestIndex));
		sc.close();

	}

}
