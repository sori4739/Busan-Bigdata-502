package ex08;

public class StringArrayEx01 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("�ȳ�");
		sb.append("����");
		sb.append("�ݰ���");
		sb.append("��Ծ���?");
		
		sb.deleteCharAt(0);
		String s = sb.toString();
		System.out.println(s);
		
		
		//������ ����.
		String c = "�ȳ�";
		c+="�ݰ���";
		c+="��Ծ���?";
		System.out.println(c);
		
		//���۴� ����ȭ ����. = �Ӱ豸������ = �Ѹ� ����� �� ����.
		//�����Ϳ� �ŷڼ��� �����.
		//��ſ� �־�� ��Ʈ������ ���� ���۸� ����Ѵ�.
		StringBuffer sbb = new StringBuffer();
		sbb.append("�ȳ�");
		sbb.append("���Ϲ���?");
		String dd = sbb.toString();
		System.out.println(dd);
		
		
		

	}

}
