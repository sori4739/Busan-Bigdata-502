package protoss;

//��η� ���� !
//�߻�Ŭ������ �Ϲݸ޼ҵ�� �߻�޼ҵ带 ������.
//�߻�Ŭ���� �տ��� abstract�� ���δ�.
//�߻�޼ҵ� �տ��� abstract�� ���δ�.
//�߻�޼Ҵ� ��ü�� ����.
//�߻�Ŭ������ new�� �� ����. ������ �߻�޼ҵ带 ������ �����̴�.
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
