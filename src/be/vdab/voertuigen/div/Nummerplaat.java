package be.vdab.voertuigen.div;

import java.io.Serializable;

public class Nummerplaat implements Serializable, Comparable<Nummerplaat>  {

	private static final long serialVersionUID = 1L;
	
	private final String plaat;

	public Nummerplaat(String plaat) {
		this.plaat = plaat;
	}

	public String getPlaat() {
		return plaat;
	}

	@Override
	public String toString() {
		return plaat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((plaat == null) ? 0 : plaat.hashCode());
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
		Nummerplaat other = (Nummerplaat) obj;
		if (plaat == null) {
			if (other.plaat != null)
				return false;
		} else if (!plaat.equals(other.plaat))
			return false;
		return true;
	}

	@Override
	public int compareTo(Nummerplaat o) {
		return this.plaat.compareTo(((Nummerplaat)o).plaat);
	}
	
	
	
	
}
