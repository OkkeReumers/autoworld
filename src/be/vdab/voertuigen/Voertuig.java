package be.vdab.voertuigen;

import java.io.Serializable;
import java.util.Comparator;

import be.vdab.voertuigen.div.Div;
import be.vdab.voertuigen.div.Nummerplaat;

public class Voertuig implements Serializable, Comparable<Voertuig> {

	private static final long serialVersionUID = 1L;
	
	Nummerplaat nummerplaat = Div.getInstance().getNummerplaat();
	private String merk;
	private int aankoopprijs;
	
	public Voertuig(String merk, int aankoopprijs) {
		this.merk = merk;
		this.aankoopprijs = aankoopprijs;
	}

	public Nummerplaat getNummerplaat() {
		return nummerplaat;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public int getAankoopprijs() {
		return aankoopprijs;
	}

	public void setAankoopprijs(int aankoopprijs) {
		if (aankoopprijs >= 0)
		this.aankoopprijs = aankoopprijs;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nummerplaat == null) ? 0 : nummerplaat.hashCode());
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
		Voertuig other = (Voertuig) obj;
		if (nummerplaat == null) {
			if (other.nummerplaat != null)
				return false;
		} else if (!nummerplaat.equals(other.nummerplaat))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "nummerplaat = " + nummerplaat + " // merk = " + merk
				+ " // aankoopprijs = € " + aankoopprijs;
	}
	
	@Override
	public int compareTo(Voertuig voertuig) {
		return this.getNummerplaat().compareTo(voertuig.getNummerplaat());
	}
	
	public static Comparator<Voertuig> getAankoopprijsComparator() {
		return new Comparator<Voertuig>(){
			
			@Override
			public int compare(Voertuig o1, Voertuig o2) {
				if (o1.equals(o2)) 
				return 0;
				
				else
				return o1.getAankoopprijs() > o2.getAankoopprijs() ? +1 : -1 ; 
				
				// kijken of 1 voertuig gelijk is aan een ander voertuig met 
				// if(o.equals(o2)) return 0; dit is gebaseerd op nummerplaat --> in de equals bepaald
				
				// als de voertuigen niet dezelfde nummerplaat hebben gaan we kijken of de aankoopprijs
				// gaan we de voertuigen sorteren op prijs van hoog naar laag, als 2 voertuigen 
				// dezelfde prijs hebben krijgen ze ook een -1 waarde, hierdoor komen ze beiden in de lijst
				// bij 0 zou maar 1 van de 2 in de lijst komen
			}
		};
	}
	
	public static Comparator<Voertuig> getMerkComparator() {
		return new Comparator<Voertuig>(){

			@Override
			public int compare(Voertuig o1, Voertuig o2) {
				
				if(o1.equals(o2)) 
																
					return 0;
				else
				return o1.getMerk().equals( o2.getMerk()) ? -1 :o1.getMerk().compareTo(o2.getMerk());
				
				// kijken of 1 voertuig gelijk is aan een ander voertuig met
				// if(o1.equals(o2)) return 0 ; dit is gebaseerd op nummerplaat --> in de equals bepaald
				
				// als de voertuigen niet dezelfde nummerplaat hebben gaan we kijken of het merk van het 1e
				// voertuig gelijk is aan het merk van het andere voertuig, als dat waar is geven we een -1 
				// terug (zodat 2 voertuigen van hetzelfde merk kunnen --> daarvoor dient het vraagteken 
				//(vraag of vorige stelling klopt)
				
				// als de stelling niet klopt gaan we de string merk vergelijken met string merk van andere
				// voertuig via de compareTo method die dan ook weer een 1 , 0 of -1 teruggeeft
				// conditional operator
			}
			
		};
			
	}

}
