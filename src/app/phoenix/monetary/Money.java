package app.phoenix.monetary;

import java.math.BigDecimal;

public interface Money {

	public BigDecimal getAmount();
	public Currency getCurrency();
	public Money add(Money another);
	public Money addAll(Money...monies);
	
}
