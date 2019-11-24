package protoss;

//통로로 쓸거 !
//추상클래스는 일반메소드와 추상메소드를 가진다.
//추상클래스 앞에는 abstract를 붙인다.
//추상메소드 앞에도 abstract를 붙인다.
//추상메소는 몸체가 없다.
//추상클래스는 new할 수 없다. 이유는 추상메소드를 가졌기 때문이다.
public abstract class Protoss {
	public abstract String getName();

	public abstract int getSt();

	public abstract int getSh();

	public abstract void setName(String name);

	public abstract void setSt(int st);

	public abstract void setSh(int sh);

	public abstract int getAttack();

	public abstract void setAttack(int attack);

	public abstract int getArmor();

	public abstract void setArmor(int armor);

}
