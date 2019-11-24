package ex06;

class Point { // extends Object
	private int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
		public String toString() {
			return super.toString();
		}
}

public class ObjectPropertyEx {

	public static void print(Point p) {
		System.out.println("getClass() :"+p.getClass());
		System.out.println("getName() :"+p.getClass().getName());
		System.out.println("hashcode() :"+p.hashCode());
		System.out.println("toString :"+p.toString());
		System.out.println("p : "+p);
	}
	
	public static void main(String[] args) {
		Point p = new Point(2,3);
		print(p);
	}

}
