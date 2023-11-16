package orgs.java.pojo;

import orgs.java.pojo.abs.Animale;

public class Aquila extends Animale{

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
}