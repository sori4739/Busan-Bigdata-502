package ex04;

//����������
//public : ��� ��Ű������ ���� ���� ex)�ٸ����� ex01���� ã�����ִ�.
//private : ���� Ŭ���������� ���� ����
//����Ʈ : ���� ��Ű�������� ���� ����
public class Elise {
	//��ü���⿡���� ������ private�� ���δ�.������ �ൿ�� ���� �� �Լ��� ���� �����̵Ǿ�� �ϴµ� ������������ ���ϰ� �ϱ������̴�.
	final String name = "�ٸ���";
	private int height = 160;
	
	//��ü���⿡���� �ൿ�� public�� ���δ�.(���� ����)
	public void drink() {
		height = height - 30;
	}
	
	//���� Ȯ���ϴ� �޼��嵵 �ʿ�
	public int getHeight() {
		return height;
	}
}
