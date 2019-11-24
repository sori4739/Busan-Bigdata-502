package starcraft;

public interface StarcraftUnit {
	
	public abstract void attack(StarcraftUnit u1);
	public abstract String getName();
	public abstract void setName(String name);
	public abstract int getSt();
	public abstract void setSt(int st);
	public abstract int getArmor();
}
