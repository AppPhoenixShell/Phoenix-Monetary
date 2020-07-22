package app.phoenix.monetary;

import java.math.BigDecimal;

public class ExchangeRate {
	
	private Currency from;
	private Currency to;
	private BigDecimal rate;
	
	public ExchangeRate(Currency from, Currency to, BigDecimal rate) {
		this.from = from;
		this.to = to;
		this.rate = rate;
	}
	public ExchangeRate(Currency from, Currency to, String rate) {
		this(from, to, new BigDecimal(rate));
	}

	
	
	public static class Builder{
		
	}
}
