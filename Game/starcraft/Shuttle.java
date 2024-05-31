package generic.starcraft;

import generic.starcraft.unit.BioUnit;

public class Shuttle<T extends BioUnit>{

	private T unit;
	
	public void in(T t) {
		unit = t;
	}
	
	public T out() {
		return unit;
	}
	
	public void showInfo() {
		System.out.println("¿Ã∏ß: " + unit.getName() + ", HP: " + unit.getHp());
	}
}
