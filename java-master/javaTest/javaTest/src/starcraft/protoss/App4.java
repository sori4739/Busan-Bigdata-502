package starcraft.protoss;

 class Unit{
	 
 }

public class App4 {

   
   
   //오버로딩 (과적재) 함수명이 같지만 다른 함수로 인식한다.
   //static void attack(Unit a) {
      //int damage = .attack - u2.armor;
      //u2.st = u2.st - damage;
      //System.out.println(u2.name+"체력:"+u2.st);
  // }
   
   
   
   public static void main(String[] args) {
	   Unit z1 = new Zealot("첫번째질럿");
	   Unit z2 = new Zealot("두번째질럿");
      
      //attack(z2,z1);
      //attack(z1,z2);
      
      Unit d1 = new Dragoon("첫번째드라군");
      //attack(z1,d1);
     // attack(d1,z1);
      
      Unit dk1 = new DarkTempler("첫번째 다크템플러");
      
      
     // attack(dk1,z1);
      //attack(dk1,d1);
     // attack(z1,dk1);
     // attack(d1,dk1);
      //다크템플러 dk2를 생성하고 dk1을 공격하세요.
      DarkTempler dk2 = new DarkTempler("두번째 다크템플러");
     // attack(dk2,dk1);
      //attack(dk1,dk2);
     // attack(z1,dk1);
   }

}
