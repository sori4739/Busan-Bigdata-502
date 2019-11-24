package ex06;

class Factory{
	private String name;
	private String addr;
	
	public Factory(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	@Override
	public String toString() {
		String result = "name : "+name+", addr :"+addr;
		return result;
	}
}

public class ObjectEx03 {

	public static void main(String[] args) {
		Factory f = new Factory("�Ｚ", "����");
		System.out.println(f.toString());
		
		Factory f2 = new Factory("�Ե�", "�λ�");
		System.out.println(f2.toString());
		
		//1�� Ÿ�Ժ�ȯ(String)
		String s = f.toString();
		System.out.println(s);
		
		int num = 10;
		String date = num+"";//int�� ���ڿ��� ���� = String
		
		Integer sum = 100; //wrapper
		String data2 = sum.toString();
		System.out.println(data2);
		
		//2�� toString()�� �������̵��ؼ� �ʵ尪�� �ѹ��� �˾ƺ���!!
		//��ü�� ȣ�� �ϸ� �ڵ����� toString()�� ȣ���Ѵ�.
		System.out.println(f);
	}

}
