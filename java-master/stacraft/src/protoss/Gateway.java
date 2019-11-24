package protoss;

public class Gateway {
	public Zealot makeZealot(String name) {
		return new Zealot(name,100,100);
	}
	public Dragoon makeDragoon(String name) {
		return new Dragoon(name,100,100);
	}
	public DarkTempler makeDarkTempler(String name) {
		return new DarkTempler(name,100,100);
	}
	
}
