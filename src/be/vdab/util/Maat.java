package be.vdab.util;



// enum met instance variabele en een method
public enum Maat {CENTIMETER(1), DECIMETER(1000), METER(1000000);
	private final int factor; // factor van elke maat: 1, 1000 of 1000000
	
	private Maat(int factor) {
		this.factor=factor;
	}
	
	public long getFactor() {
		return factor;
	}
		
}

