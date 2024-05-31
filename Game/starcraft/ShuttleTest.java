package generic.starcraft;

import generic.starcraft.unit.Marine;
import generic.starcraft.unit.Zealot;
import generic.starcraft.unit.Zergling;

public class ShuttleTest {

	public static void main(String[] args) {
		Shuttle<Marine> shuttle1 = new Shuttle<>();
		shuttle1.in(new Marine("����", 40));
		shuttle1.showInfo();
		
		Shuttle<Zergling> shuttle2 = new Shuttle<>();
		shuttle2.in(new Zergling("���۸�", 35));
		shuttle2.showInfo();
		
		Shuttle<Zealot> shuttle3 = new Shuttle<>();
		shuttle3.in(new Zealot("����", 100));
		shuttle3.showInfo();
	}

}
