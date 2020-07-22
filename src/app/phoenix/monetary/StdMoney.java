package app.phoenix.monetary;

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
	public Money add(Money another) {
		BigDecimal total = new BigDecimal(amount.toString());
		
		total.add(another.getAmount());
		
		
		
		return new StdMoney(amount, currency);
	}

	@Override
	public Money addAll(Money... monies) {
		BigDecimal total = new BigDecimal(amount.toString());
		
		for(Money m : monies)
			total.add(m.getAmount());
		
		return new StdMoney(total, currency);
	}
	
	
	
}
