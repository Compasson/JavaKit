
public class MyException extends Exception{

	private int invalidData;
	
	public int getInvalidData() {
		return invalidData;
	}

	public MyException(String arg0, int invalidData) {
		super(arg0);
		this.invalidData = invalidData;
		
	}
	

}
