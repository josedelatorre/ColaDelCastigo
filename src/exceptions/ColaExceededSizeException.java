package exceptions;

@SuppressWarnings("serial")
public class ColaExceededSizeException extends RuntimeException {

	public ColaExceededSizeException(String msg)  {
		super("[TU SUPEREXCEPTION]: " + msg);
	}
}
