package be.vdab.voertuigen;

public class Personenwagen extends Voertuig {

	private static final long serialVersionUID = 1L;
	
	private int zitplaatsen;

	public Personenwagen(String merk, int aankoopprijs, int zitplaatsen) {
		super(merk, aankoopprijs);
		this.zitplaatsen = zitplaatsen;
	}

	public int getZitplaatsen() {
		return zitplaatsen;
	}

	public void setZitplaatsen(int zitplaatsen) {
		if(zitplaatsen > 0)
		this.zitplaatsen = zitplaatsen;
	}

	@Override
	public String toString() {
		return "Personenwagen --> " + super.toString() + " // zitplaatsen = " + zitplaatsen;
	}
	
	
	
}
