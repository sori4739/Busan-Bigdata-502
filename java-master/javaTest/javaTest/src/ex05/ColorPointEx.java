package ex05;

class Point {
	private int x, y;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
	
}
class ColorPoint extends Point{
	
	private String color;
	
	
	public void setColor(String color) {
		this.color = color;
	}
	 public void showColorPoint() {
		 showPoint();
		 System.out.println(color);
	 }
}

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(1);
		p.setY(2);
		p.showPoint();
		ColorPoint cp = new ColorPoint();
		cp.setX(3);
		cp.setY(4);
		cp.setColor("red");
		cp.showColorPoint();
		cp.showPoint();

	}

}
