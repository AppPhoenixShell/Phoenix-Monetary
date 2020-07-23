package app.phoenixshell.monetary;

/**/
public enum Currency
{
	AUD("AUD"), 
	USD("USD");
	
	private final String code;
	
	Currency(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
}
