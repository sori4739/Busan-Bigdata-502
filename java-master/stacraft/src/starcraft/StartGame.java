package starcraft;

import protoss.DarkTempler;
import protoss.Dragoon;
import protoss.Gateway;
import protoss.Porge;
import protoss.ProtossUnit;
import protoss.Zealot;
import terran.Armery;
import terran.TerranUnit;
import zerg.Chamber;
import zerg.Hatchery;
import zerg.Ultra;
import zerg.ZergUnit;

public class StartGame {

	public static void main(String[] args) {
		//���׷��̵� (�����佺 ����)
		//1.�����Ǽ�
		Porge porge1 = new Porge();
		//2.���׷��̵�
		porge1.upgradeAttack();
		porge1.upgradeArmor();
		
		//���� ��ü, ��� ��ü ,��ũ���÷� ��ü�� ���� 1����
		//������ heap������� 1���� ��ų �� ����.
		
		//3. ���ݷ�Ȯ�� ���� Ȯ��
		ProtossUnit.protossAttackOrArmorPrint(); 
		
		//���׷��̵� (�׶�����)
		//1.�ƸӸ� �Ǽ�
		Armery armery1 = new Armery();
		//2.���׷��̵�
		armery1.upgradeAttack();
		armery1.upgradeArmor();
		
		//3.��,�� Ȯ��
		TerranUnit.terranAttackOrArmor();
		
		//1.è���Ǽ�
		Chamber chamber1 = new Chamber();
		//2.���׷��̵�
		chamber1.upgradeAttack();
		chamber1.upgradeArmor();
		//3.����Ȯ��
		ZergUnit.zergAttackOrArmor();
		
		//����1,��Ʈ��1 ����
		//����Ʈ����
		Gateway gateway1 = new Gateway();
		
		//��ó��
		Hatchery hatchery1 = new Hatchery();
		
		Zealot zealot1 = gateway1.makeZealot("����1");
		Zealot zealot2 = gateway1.makeZealot("����2");
		Ultra ultra1 = hatchery1.makeUltra("��Ʈ��1");
		
		//����1 => ��Ʈ�� 1 ����
		zealot1.attack(ultra1);
		System.out.println(ultra1.getName()+"�� ü����"+ultra1.getSt());
	
		//����1 => ���� 2 ����
		zealot1.attack(zealot2);
		zealot1.attack(zealot2);
		zealot1.attack(zealot2);
		zealot1.attack(zealot2);
		zealot1.attack(zealot2);
		zealot1.attack(zealot2);
		zealot1.attack(zealot2);
		zealot1.attack(zealot2);
		zealot1.attack(zealot2);
		zealot1.attack(zealot2);
	
		
		System.out.println(zealot2.getName()+"�� �����"+zealot2.getSh());
		System.out.println(zealot2.getName()+"�� ü����"+zealot2.getSt());
	}
}
