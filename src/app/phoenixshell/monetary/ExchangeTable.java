package app.phoenixshell.monetary;

public interface ExchangeTable {
	
	public ExchangeRate getRate(Currency from, Currency to);
}
