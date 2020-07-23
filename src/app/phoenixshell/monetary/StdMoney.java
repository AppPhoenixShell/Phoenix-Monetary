package app.phoenixshell.monetary;

import java.math.BigDecimal;

public class StdMoney implements Money{
	
	private BigDecimal amount;
	private Currency currency;
	

	/* MAIN CONSTRUCTOR*/
	public StdMoney(BigDecimal amount, Currency currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public StdMoney(String amount, Currency currency) {
		this(new BigDecimal(amount), currency);
	}

	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public Currency getCurrency() {
		return currency;
	}
	

	@Override
	public Money add(ExchangeTable table, Money another) {
		boolean compat = MoneyRuntime.checkCurrencyCompatability(this, another);
		if(!compat) {
			another = another.exchange(table, this.currency);
		}
		
		
		BigDecimal total = new BigDecimal(amount.toString());
		total = total.add(another.getAmount());
		return new StdMoney(total, currency);
	}
	
	@Override
	public Money add(Money another) {
		return add(MoneyRuntime.getExchange(),another);
	}

	@Override
	public Money addAll(ExchangeTable table, Money... monies) {
		BigDecimal total = new BigDecimal(amount.toString());
		
		for(Money m : monies)
			total = total.add(m.getAmount());
		
		return new StdMoney(total, currency);
	}
	
	@Override
	public Money addAll(Money...monies) {
		return addAll(MoneyRuntime.getExchange(),monies);
	}

	@Override
	public Money exchange(ExchangeTable table, Currency newCurrency) {
		ExchangeRate rate = table.getRate(getCurrency(), newCurrency);
		
		return exchange(rate);
	}
	public Money exchange(ExchangeRate rate) {
		return null;
	}

	@Override
	public Money multiply(BigDecimal another) {
		BigDecimal total= this.amount.multiply(another);
		
		return new StdMoney(total, this.currency);
	}
	
	
	
}
