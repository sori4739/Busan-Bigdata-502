package ex02;
//�������� ������ �������� Ŭ����(class)�� �ٿ����Ѵ�.
class People{
	static int age = 35;
	static String name = "����ȣ";
	static String email = "ssar@nate.com";
	static char gender = '��';
}





public class ReferenceEx02 {

	public static void main(String[] args) {
	
		System.out.println(People.age);
		System.out.println(People.email);
		System.out.println(People.gender);
		System.out.println(People.name);
		
		
	}

}
//�ڹٴ� static�� ã�´�. static�̶�� �������� �޸� (��)�� �ø���. static�� ���� ������ �޸𸮿� �ö󰡰� ������ ������ ���� �޸𸮿��� �����ȴ�.
//static��ã�� �޸𸮿� �ø��� main�� ã�´�.
//main�� ���� �Ѵ�.
//�ڹ��� ������ Ŭ���� �ȿ� �־�� �Ѵ�.
//�ڹٴ� main()���� �����ؼ� main()���� ������.
//��� ���� ���ξȿ� �־�� ���� ����̵ȴ� . ���ξȿ� �־�� �޸𸮿��� ����Ǳ⶧��.
//�Լ� �� �߰�ȣ �� = stack
//Heap=Ŭ���� ����(Ŀ���� �ڷ�)�� Ÿ������ �ΰ� ������ �����ѵ� = new Ÿ��(); = �޸𸮿� ���� ���Ҷ� �ø��� �������ִٴ� ����.