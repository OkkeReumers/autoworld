package be.vdab.util;

import java.io.Serializable;

public class Volume implements Comparable<Volume> , Serializable {

	private static final long serialVersionUID = 1L;
	
	private final Maat maat;
	private final int breedte;
	private final int hoogte;
	private final int diepte;
	
	public Volume(int breedte, int hoogte, int diepte, Maat maat) throws VolumeException{
		if (breedte < 0 || hoogte < 0 || diepte < 0) {
			throw new VolumeException("Het volume mag niet negatief zijn ! ");
		}
		else {
				this.breedte = breedte;
				this.hoogte = hoogte;
				this.diepte = diepte;
				this.maat = maat;	
			} 
		}
	

	public long getVolume() {
		return breedte * hoogte * diepte * maat.getFactor();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + breedte;
		result = prime * result + diepte;
		result = prime * result + hoogte;
		result = prime * result + ((maat == null) ? 0 : maat.hashCode());
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
		Volume other = (Volume) obj;
		if (breedte != other.breedte)
			return false;
		if (diepte != other.diepte)
			return false;
		if (hoogte != other.hoogte)
			return false;
		if (maat != other.maat)
			return false;
		return true;
	}

	@Override //niet uitgeschreven?
	public int compareTo(Volume o) {  //compareTo() met equals breedte diepte hoogte maat
		// TODO Auto-generated method stub
		return 0;
	}

	
	

	
	
	

}
