package orgs.java.pojo;

import orgs.java.pojo.abs.Animale;
import orgs.java.pojo.inter.INuotante;
import orgs.java.pojo.inter.IVolante;

public class Main {

	public static void main(String[] args) {
		
		Animale[] animali = new Animale[4];
		
		Passerotto pass1 = new Passerotto("Bird", 2);
		Delfino delf1 = new Delfino("Mammal", 0);
		Aquila aqui1 = new Aquila("Bird", 2);
		Cane cane1 = new Cane("Mammal", 4);
		
		animali[0] = pass1;
		animali[1] = delf1;
		animali[2] = aqui1;
		animali[3] = cane1;
		
		for(int i = 0; i < animali.length; i++) {
			System.out.println("Il " + animali[i].getClass() + " fa il verso: ");
			animali[i].verso();
			System.out.println("Il " + animali[i].getClass() + " mangia: ");
			animali[i].mangia();
		}
	}
	
	public static void faiVolare(IVolante pass1) {
		pass1.vola();
	}
	
	public static void faiNuotare(INuotante delf1) {
		delf1.nuota();
	}
}

