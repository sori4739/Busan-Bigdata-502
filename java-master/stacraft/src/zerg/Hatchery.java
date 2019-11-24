package zerg;

public class Hatchery {
	public Hydra makeHydrat(String name) {
		return new Hydra(name,100);
	}
	public Ultra makeUltra(String name) {
		return new Ultra(name,100);
	}
}
