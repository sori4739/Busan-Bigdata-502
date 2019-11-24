package ex07;

//if )������� ������ �������� Ÿ���� �� ��
//1 ) <T> ���׸� ���� ���� ��ü�� ������ �� Ÿ���� ���������� ������ Object (���� Ÿ�Ծ˰��־�� ĳ�����Ҽ��ִ�)
class Movie<T, K>{
	T name;
	K rating;//����
}

public class GenericEx01 {

	public static void main(String[] args) {
		Movie m = new Movie();
		m.name = "��Ž�Ʈ����";
		m.rating = 9.0;
		
		System.out.println(m.name);
		System.out.println(m.rating);
		
		String name = (String)m.name;
		int rating = (int)m.rating;
		
		Movie<String, Double> movie = new Movie<>();
		movie.name = "�����";
		movie.rating = 9.0;
	}

}
