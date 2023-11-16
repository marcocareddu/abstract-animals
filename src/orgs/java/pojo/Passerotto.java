package orgs.java.pojo;

import orgs.java.pojo.abs.Animale;
import orgs.java.pojo.inter.IVolante;

public class Passerotto extends Animale implements IVolante {

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

	@Override
	public void faiVolare() {
		System.out.println("Sto volando!!!");
	}
}
