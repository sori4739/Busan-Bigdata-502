package terran;

public class Factory {
	public Tank makeTank(String name) {
		return new Tank(name,100);
	}
}
