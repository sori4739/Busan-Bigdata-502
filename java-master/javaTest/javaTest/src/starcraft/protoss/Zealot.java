package starcraft.protoss;

public class Zealot extends Unit {//커스텀 자료형
   String name;
   int attack = 10;
   int st = 100;
   int armor = 5;
   
   //생성자
   //heap이 만들어질 때 최초의 실행되는 것 , 초기값 세팅
   public Zealot(String n) {
      name = n;
      System.out.println("My Life Aiur");
      
   }
   
   public Zealot() {
      
   }
   //디폴트 생성자
   //생성자를 개발자가 만들지않으면 생성된다.
//   public Zealot() {
//      
//   }
}
