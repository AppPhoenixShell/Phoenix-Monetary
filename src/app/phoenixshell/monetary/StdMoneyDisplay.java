package app.phoenixshell.monetary;

public class StdMoneyDisplay implements MoneyDisplay{

	@Override
	public String getDisplay(Money money) {
		
		String prefix = "";
		return String.format("%s %.2f",money.getCurrency().getCode(),   money.getAmount().floatValue());
		/*
		switch (money.getCurrency()) {
		case AUD: {
			//return String.format("$ %.2f", money.getAmount().floatValue());
			
		}
		default:
			return String.format("%s %.2f",money.getCurrency().getCode(),   money.getAmount().floatValue());
		}
		*/
		
		
		
	}

}
