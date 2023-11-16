package orgs.java.pojo.abs;

public abstract class Animale {
	private String type;
	private int paws;

//	Constructor
	public Animale(String type, int paws) {
		getType();
		getPaws();
	}

//	Getters
	public int getPaws() {
		return paws;
	}
	public String getType() {
		return type;
	}

//	Abtrasct methods
	public abstract void verso();
	public abstract void mangia();
	
//	Methods
	public void dormi() {
		System.out.println("Zzz");
	}
}
