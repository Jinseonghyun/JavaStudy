package generic.starcraft;

import generic.starcraft.unit.Marine;
import generic.starcraft.unit.Zealot;

public class UnitUtilTest {
	
	public static void main(String[] args) {
		Marine m1 = new Marine("¸¶¸°1", 40);
		Marine m2 = new Marine("¸¶¸°2", 50);
		Marine resultMarine = UnitUtil.maxHp(m1, m2);
		System.out.println("resultMarine = " + resultMarine);
		
		Zealot z1 = new Zealot("Áú·µ1", 100);
		Zealot z2 = new Zealot("Áú·µ2", 150);
		Zealot resultZealot = UnitUtil.maxHp(z1, z2);
		System.out.println("resultZealot = " + resultZealot);
	}
}
