package starcraft.protoss;

 class Unit{
	 
 }

public class App4 {

   
   
   //�����ε� (������) �Լ����� ������ �ٸ� �Լ��� �ν��Ѵ�.
   //static void attack(Unit a) {
      //int damage = .attack - u2.armor;
      //u2.st = u2.st - damage;
      //System.out.println(u2.name+"ü��:"+u2.st);
  // }
   
   
   
   public static void main(String[] args) {
	   Unit z1 = new Zealot("ù��°����");
	   Unit z2 = new Zealot("�ι�°����");
      
      //attack(z2,z1);
      //attack(z1,z2);
      
      Unit d1 = new Dragoon("ù��°���");
      //attack(z1,d1);
     // attack(d1,z1);
      
      Unit dk1 = new DarkTempler("ù��° ��ũ���÷�");
      
      
     // attack(dk1,z1);
      //attack(dk1,d1);
     // attack(z1,dk1);
     // attack(d1,dk1);
      //��ũ���÷� dk2�� �����ϰ� dk1�� �����ϼ���.
      DarkTempler dk2 = new DarkTempler("�ι�° ��ũ���÷�");
     // attack(dk2,dk1);
      //attack(dk1,dk2);
     // attack(z1,dk1);
   }

}
