package customException;

public class InvalidCarException extends Exception{
	private String message;
	
	public InvalidCarException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	

}
