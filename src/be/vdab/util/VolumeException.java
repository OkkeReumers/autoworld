package be.vdab.util;

public class VolumeException extends Exception {

	private static final long serialVersionUID = 1L;
	
	
	public VolumeException() {}
	
	public VolumeException(String msg) {
		super(msg);
	}
	
	public VolumeException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	public VolumeException(Throwable cause) {
		super(cause);
	}
}
