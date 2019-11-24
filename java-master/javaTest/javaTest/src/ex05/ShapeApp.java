package ex05;


//�߻�޼ҵ尡�ִ� Ŭ������ ���Ҽ�����.
abstract class Shape{
	public abstract void draw();
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");	
	}
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");	
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");	
	}
}

public class ShapeApp {

		static void paint(Shape a) {
			a.draw();
		}
	
	public static void main(String[] args) {
		Line line = new Line();
		Rect rect = new Rect();
		Circle circle = new Circle();

		paint(line);
		paint(rect);
		paint(circle);
	}

}
