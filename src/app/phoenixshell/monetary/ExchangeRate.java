package app.phoenixshell.monetary;

import java.math.BigDecimal;

import app.phoenixshell.monetary.err.MonetaryException;

public class ExchangeRate {
	
	private Currency from;
	private Currency target;
	private BigDecimal rate;
	
	public ExchangeRate(Currency from, Currency target, BigDecimal rate) {
		this.from = from;
		this.target = target;
		this.rate = rate;
	}
	public ExchangeRate(Currency from, Currency to, String rate) {
		this(from, to, new BigDecimal(rate));
	}
	
	/*converts money from currenct to target */
	public Money forwardExchange(Money amount) throws MonetaryException {
		return amount.exchange(this);
	}
	
	/*converts the amount if amount is target currency to base currency*/
	public Money reverseExchange(Money amount) {
		return null;
	}
	

	
	public static class Builder{
		
	}
}
