package orgs.java.pojo;

import orgs.java.pojo.abs.Animale;

public class Passerotto extends Animale {

	
	public Passerotto(String type, int paws) {
		super(type, paws);
	}

	@Override
	public void verso() {
		System.out.println("Cip Cip");
	}

	@Override
	public void mangia() {
		System.out.println("Insetti");
	}


}
