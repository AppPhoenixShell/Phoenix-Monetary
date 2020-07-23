package app.phoenixshell.monetary;

import app.phoenixshell.monetary.err.MonetaryException;

public class MoneyRuntime {
	
	private static MoneyConfig CONFIG;
	
	public static void initialize(MoneyConfig myConfig) {
		if(CONFIG != null)
			throw new RuntimeException("Money Runtime can only be initialized with a config file once runtime");
		CONFIG = myConfig;
	}

	
	public static boolean checkCurrencyCompatability(Money a1, Money a2) {
		return checkCurrencyCompatability(a1.getCurrency(), a2.getCurrency());
	}
	
	public static boolean checkCurrencyCompatability(Currency a1, Currency a2) {
		return a1 == a2;
	}
	
	public static void checkCurrencyCompatabilityThrows(Currency a1, Currency a2) throws MonetaryException {
		if(a1 != a2)
			throw new MonetaryException(MonetaryException.CODE_CURRENCY_INCOMPATABILITY, 
					"Currencies are incompatiable");
	}
	
	public static void checkCurrencyCompatabilityThrows(Money a1, Money a2) throws MonetaryException {
		checkCurrencyCompatabilityThrows(a1.getCurrency(), a2.getCurrency());
			
	}
	
	public static ExchangeTable getExchange() {
		return CONFIG.getExchange();
	}
}
