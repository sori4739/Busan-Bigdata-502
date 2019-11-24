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
		//업그레이드 (프로토스 유닛)
		//1.포지건설
		Porge porge1 = new Porge();
		//2.업그레이드
		porge1.upgradeAttack();
		porge1.upgradeArmor();
		
		//질럿 객체, 드라군 객체 ,다크템플러 객체의 변수 1증가
		//변수가 heap변수라면 1증가 시킬 수 없다.
		
		//3. 공격력확인 방어력 확인
		ProtossUnit.protossAttackOrArmorPrint(); 
		
		//업그레이드 (테란유닛)
		//1.아머리 건설
		Armery armery1 = new Armery();
		//2.업그레이드
		armery1.upgradeAttack();
		armery1.upgradeArmor();
		
		//3.공,방 확인
		TerranUnit.terranAttackOrArmor();
		
		//1.챔버건설
		Chamber chamber1 = new Chamber();
		//2.업그레이드
		chamber1.upgradeAttack();
		chamber1.upgradeArmor();
		//3.공방확인
		ZergUnit.zergAttackOrArmor();
		
		//질럿1,울트라1 생성
		//게이트웨이
		Gateway gateway1 = new Gateway();
		
		//해처리
		Hatchery hatchery1 = new Hatchery();
		
		Zealot zealot1 = gateway1.makeZealot("질럿1");
		Zealot zealot2 = gateway1.makeZealot("질럿2");
		Ultra ultra1 = hatchery1.makeUltra("울트라1");
		
		//질럿1 => 울트라 1 공격
		zealot1.attack(ultra1);
		System.out.println(ultra1.getName()+"의 체력은"+ultra1.getSt());
	
		//질럿1 => 질럿 2 공격
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
	
		
		System.out.println(zealot2.getName()+"의 쉴드는"+zealot2.getSh());
		System.out.println(zealot2.getName()+"의 체력은"+zealot2.getSt());
	}
}
