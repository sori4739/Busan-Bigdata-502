package ex04;

public class LifeApp {

	public static void main(String[] args) {
		Life life = new Life("최주호",1000,50);
		System.out.println("객체가 생성되었습니다.");
		System.out.println(life.getName()+"이 태어났습니다.");
		System.out.println("재산은" +life.getProperty()+"원");
		System.out.println("키는" +life.getHeight()+"입니다.");
		
		life.getJob();
		System.out.println("재산은" +life.getProperty()+"원");
		
		life.marry();
		System.out.println("재산은" +life.getProperty()+"원");
	}

}
