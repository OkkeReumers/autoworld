package be.vdab.voertuigen;

import be.vdab.util.Laadbaar;
import be.vdab.util.Volume;
import be.vdab.voertuigen.Personenwagen;

public class Pickup extends Personenwagen implements Laadbaar {

	private static final long serialVersionUID = 1L;
	
	private Volume laadvolume;
	
	public Pickup(String merk, int aankoopprijs, int zitplaatsen, Volume laadvolume) {
		super(merk, aankoopprijs, zitplaatsen);
		setLaadvolume(laadvolume);
	}

	@Override
	public Volume getLaadvolume() {
		return laadvolume;
	}

	@Override
	public void setLaadvolume(Volume laadvolume) {
		this.laadvolume = laadvolume;
		
	}

	@Override
	public String toString() {
		return "Pickup " + super.toString() + " // laadvolume = " + laadvolume.getVolume() + " m² " ;
	}
	
}
