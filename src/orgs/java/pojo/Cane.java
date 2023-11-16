package orgs.java.pojo;

import orgs.java.pojo.abs.Animale;

public class Cane extends Animale {

	public Cane(String type, int paws) {
		super(type, paws);
	}

	@Override
	public void verso() {
		System.out.println("Bau Bau");
	}

	@Override
	public void mangia() {
		System.out.println("Carne");
	}
}