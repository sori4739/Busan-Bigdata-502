package starcraft.protoss;

public class Zealot extends Unit {//Ŀ���� �ڷ���
   String name;
   int attack = 10;
   int st = 100;
   int armor = 5;
   
   //������
   //heap�� ������� �� ������ ����Ǵ� �� , �ʱⰪ ����
   public Zealot(String n) {
      name = n;
      System.out.println("My Life Aiur");
      
   }
   
   public Zealot() {
      
   }
   //����Ʈ ������
   //�����ڸ� �����ڰ� ������������ �����ȴ�.
//   public Zealot() {
//      
//   }
}
