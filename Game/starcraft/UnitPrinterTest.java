package generic.starcraft;

import generic.starcraft.unit.Marine;
import generic.starcraft.unit.Zealot;
import generic.starcraft.unit.Zergling;

public class UnitPrinterTest {

	public static void main(String[] args) {
		Shuttle<Marine> shuttle1 = new Shuttle<>();
		shuttle1.in(new Marine("¸¶¸°", 40));
		
		Shuttle<Zergling> shuttle2 = new Shuttle<>();
		shuttle2.in(new Zergling("Áú·µ", 100));
		
		Shuttle<Zealot> shuttle3 = new Shuttle<>();
		shuttle3.in(new Zealot("Áú·µ", 100));
		
		UnitPrinter.printV1(shuttle1);
		UnitPrinter.printV2(shuttle1);

	}

}
