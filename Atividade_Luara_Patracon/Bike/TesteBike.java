package Bike;

import java.util.Scanner;

public class TesteBike {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		SpeedBike b1 = new SpeedBike();
		SpeedBike b2 = new SpeedBike();
		MountainBike m1 = new MountainBike();
		MountainBike m2 = new MountainBike();
		Pessoas p1 = new Pessoas ();
		p1.subir();
		b1.setVelocidade(100);
		b1.acelerar(10);
		System.out.println("a pessoa acelerou e agora ela esta a "  + b1.getVelocidade() + " por hora");
	}

}
