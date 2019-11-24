package ex04;

import java.util.Scanner;

class Rectangle {
	private int width;
	private int height;
	
	public int getArea() {
		return width *  height;
		
		
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}


public class RectApp {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println(">> ");
		rect.setWidth(sc.nextInt()); 
		rect.setHeight(sc.nextInt()); 
		
		System.out.println("사각형의 면적은 : "+rect.getArea());
		
		sc.close();

	}

}
