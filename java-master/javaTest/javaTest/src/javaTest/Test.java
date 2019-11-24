package javaTest;

class Power{
	private int kick;
	private int punch;
	
	public int getKick() {
		return kick;
	}

	public void setKick(int kick) {
		this.kick = kick;
	}

	public int getPunch() {
		return punch;
	}

	public void setPunch(int punch) {
		this.punch = punch;
	}

	public Power(int kick, int punch) {
		this.kick = kick;
		this.punch = punch;
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		Power robot = new Power(10,20);
		System.out.println(robot.getKick());
		
	}

}
