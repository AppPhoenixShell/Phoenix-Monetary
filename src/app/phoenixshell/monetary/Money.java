package app.phoenixshell.monetary;

import java.math.BigDecimal;

import app.phoenixshell.monetary.err.MonetaryException;

public interface Money {

	
	public BigDecimal getAmount();
	public Currency getCurrency();
	
	public Money add(Money another) throws MonetaryException;
	public Money add(ExchangeTable exchange,Money another) throws MonetaryException;
	
	public Money addAll(ExchangeTable table, Money...monies) throws MonetaryException;
	public Money addAll(Money...monies) throws MonetaryException;
	
	public Money multiply(BigDecimal another);
	
	public Money exchange(ExchangeTable table, Currency target);
	public Money exchange(ExchangeRate rate);
	
}
