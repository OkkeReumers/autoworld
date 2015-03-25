package be.vdab.voertuigen.div;

public class Div {
	private static final Div instance = new Div();
	// gebruikt de private constructor
	
	public static Div getInstance() {
		return instance;
	}
	
	private Div(){} // is private constructor
	
	private int nummer=1;
	
	public Nummerplaat getNummerplaat() {
		String plaat = String.format("AAA%03d", nummer++);
		if (nummer>=999) {
			nummer = 1;
		}
		return new Nummerplaat(plaat);
	}

}
