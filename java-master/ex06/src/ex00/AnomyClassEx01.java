package ex00;

interface Knife{
	void cook(); //public abstract = �߻� �޼���
	void kill();
}

public class AnomyClassEx01 {
	
	static class ������ implements Knife{

		@Override
		public void cook() {
			System.out.println("�丮�ϴ� ��");			
		}

		@Override
		public void kill() {}
	}

	public static void main(String[] args) {
		//Knife k = new Knife(); �������̽�, �߻�޼��� ������ �ִ� Ŭ���� �� ����
		������ b = new ������();
		b.cook();
		
		
		//�͸�Ŭ����
		new Knife() {
			
			@Override
			public void kill() {}
			
			@Override
			public void cook() {
				System.out.println("�丮�ϰ� �ֽ��ϴ�.");
			}
		}.cook();
		
	Knife k  =	new Knife() {
			
			@Override
			public void kill() {
				System.out.println("����");
				
			}
			
			@Override
			public void cook() {
				// TODO Auto-generated method stub
				
			}
		};
		
		k.kill();

	}

}
