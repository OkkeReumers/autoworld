package be.vdab.schoolgerief;

import java.io.Serializable;

import be.vdab.util.Laadbaar;
import be.vdab.util.Volume;

public class Boekentas implements Laadbaar, Serializable {

	private static final long serialVersionUID = 1L;
	
	private Volume laadvolume;
	private String kleur;

	public Boekentas(Volume laadvolume, String kleur) {
		this.laadvolume = laadvolume;
		this.kleur = kleur;
		setLaadvolume(laadvolume);
		setKleur(kleur);
	}

	public Volume getLaadvolume() {
		return laadvolume;
	}

	public void setLaadvolume(Volume laadvolume) {
		try {
			if (laadvolume != null == false) 
				this.laadvolume = laadvolume;
		} catch (IllegalArgumentException e){
			  
		  };
		}

	public String getKleur() {
		return kleur;
	}

	public void setKleur(String kleur) {
		try {
			if (kleur != null && kleur.isEmpty() == false) 
				this.kleur = kleur;
		} catch (IllegalArgumentException e){
			  
		  };
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kleur == null) ? 0 : kleur.hashCode());
		result = prime * result
				+ ((laadvolume == null) ? 0 : laadvolume.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Boekentas other = (Boekentas) obj;
		if (kleur == null) {
			if (other.kleur != null)
				return false;
		} else if (!kleur.equals(other.kleur))
			return false;
		if (laadvolume == null) {
			if (other.laadvolume != null)
				return false;
		} else if (!laadvolume.equals(other.laadvolume))
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "Boekentas laadvolume = " + laadvolume.getVolume() + " m² // kleur = " + kleur;
	}
	
	
	
	

}
