package orgs.java.pojo;

import orgs.java.pojo.abs.Animale;

public class Delfino extends Animale {

	public Delfino(String type, int paws) {
		super(type, paws);
	}

	@Override
	public void verso() {
		System.out.println("Click Click");
	}

	@Override
	public void mangia() {
		System.out.println("Pesce");
	}

}