package ex00;

interface Knife{
	void cook(); //public abstract = 추상 메서드
	void kill();
}

public class AnomyClassEx01 {
	
	static class 백종원 implements Knife{

		@Override
		public void cook() {
			System.out.println("요리하는 중");			
		}

		@Override
		public void kill() {}
	}

	public static void main(String[] args) {
		//Knife k = new Knife(); 인터페이스, 추상메서드 가지고 있는 클래스 뉴 못함
		백종원 b = new 백종원();
		b.cook();
		
		
		//익명클래스
		new Knife() {
			
			@Override
			public void kill() {}
			
			@Override
			public void cook() {
				System.out.println("요리하고 있습니다.");
			}
		}.cook();
		
	Knife k  =	new Knife() {
			
			@Override
			public void kill() {
				System.out.println("살인");
				
			}
			
			@Override
			public void cook() {
				// TODO Auto-generated method stub
				
			}
		};
		
		k.kill();

	}

}
