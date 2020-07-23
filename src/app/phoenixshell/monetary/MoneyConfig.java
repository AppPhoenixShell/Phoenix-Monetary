package app.phoenixshell.monetary;

public class MoneyConfig
{
	private final Currency baseCurrency;
	private final ExchangeTable exchange;
	
	public MoneyConfig(Currency baseCurrency, ExchangeTable exchange) {
		this.baseCurrency = baseCurrency;
		this.exchange = exchange;
	}

	public ExchangeTable getExchange() {
		return exchange;
	}
}
