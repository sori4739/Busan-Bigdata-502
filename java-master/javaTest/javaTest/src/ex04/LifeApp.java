package ex04;

public class LifeApp {

	public static void main(String[] args) {
		Life life = new Life("����ȣ",1000,50);
		System.out.println("��ü�� �����Ǿ����ϴ�.");
		System.out.println(life.getName()+"�� �¾���ϴ�.");
		System.out.println("�����" +life.getProperty()+"��");
		System.out.println("Ű��" +life.getHeight()+"�Դϴ�.");
		
		life.getJob();
		System.out.println("�����" +life.getProperty()+"��");
		
		life.marry();
		System.out.println("�����" +life.getProperty()+"��");
	}

}
