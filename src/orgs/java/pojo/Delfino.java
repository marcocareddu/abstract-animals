package orgs.java.pojo;

import orgs.java.pojo.abs.Animale;
import orgs.java.pojo.inter.INuotante;

public class Delfino extends Animale implements INuotante{

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

	@Override
	public void faiNuotare() {
		System.out.println("Sto nuotando!!!");
	}
}