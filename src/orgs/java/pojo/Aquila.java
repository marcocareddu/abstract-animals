package orgs.java.pojo;

import orgs.java.pojo.abs.Animale;
import orgs.java.pojo.inter.IVolante;

public class Aquila extends Animale implements IVolante{

	public Aquila(String type, int paws) {
		super(type, paws);
	}

	@Override
	public void verso() {
		System.out.println("Pio Pio");
	}

	@Override
	public void mangia() {
		System.out.println("Carne");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}
}