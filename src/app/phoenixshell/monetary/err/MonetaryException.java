package app.phoenixshell.monetary.err;

public class MonetaryException extends Exception{
	
	public static final int CODE_GENERAL = 0;
	public static final int CODE_CURRENCY_INCOMPATABILITY = 1;

	
	private int excpetionCode;
	
	public MonetaryException(int exceptionCode, String msg) {
		super(msg);
		this.excpetionCode = exceptionCode;
	}
}
