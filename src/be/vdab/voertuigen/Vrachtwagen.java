package be.vdab.voertuigen;

import be.vdab.util.Laadbaar;
import be.vdab.util.Volume;

public class Vrachtwagen extends Voertuig implements Laadbaar {

	private static final long serialVersionUID = 1L;
	
	private Volume laadvolume;
	private int maximaalToegelatenMassa;
	private int aantalAssen;
	
	public Vrachtwagen(String merk, int aankoopprijs, Volume laadvolume, int maximaalToegelatenMassa, int aantalAssen) {
		super(merk, aankoopprijs);
		setLaadvolume(laadvolume);
		setMaximaalToegelatenMassa(maximaalToegelatenMassa);
		setAantalAssen(aantalAssen);
	}

	@Override
	public Volume getLaadvolume() {
		return laadvolume;
	}

	@Override
	public void setLaadvolume(Volume laadvolume) {
		this.laadvolume = laadvolume;
	}

	public int getMaximaalToegelatenMassa() {
		return maximaalToegelatenMassa;
	}

	public void setMaximaalToegelatenMassa(int maximaalToegelatenMassa) {
		if (maximaalToegelatenMassa > 0)
		this.maximaalToegelatenMassa = maximaalToegelatenMassa;
	}

	public int getAantalAssen() {
		return aantalAssen;
	}

	public void setAantalAssen(int aantalAssen) {
		if (aantalAssen > 0)
		this.aantalAssen = aantalAssen;
	}

	@Override
	public String toString() {
		return "Vrachtwagen --> " + super.toString() + " // laadvolume = " + laadvolume.getVolume() + " m² "
				+ " // maximaal toegelaten massa = " + maximaalToegelatenMassa + " kg"
				+ " // aantal assen=" + aantalAssen;
	}
	
	

}
