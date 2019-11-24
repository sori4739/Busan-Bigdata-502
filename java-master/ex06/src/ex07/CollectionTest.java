package ex07;

import java.util.Vector;

class Point{
	private int x,  y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return"(" + x + "," + y+")";
	}
	
}
public class CollectionTest {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();//Point ��ü�� ��ҷ� �ٷ�� ���� ����
		
		//3���� Point ��ü����
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		v.remove(1); // �ε��� 1�� Point(-5,20) ��ü ����
		
		//���Ϳ� �ִ� Point ��ü ��� �˻��Ͽ� ���
		int vSize = v.size();
		for (int i = 0; i < vSize; i++) {
			System.out.println(v.get(i));
			
		}
		

	}

}
