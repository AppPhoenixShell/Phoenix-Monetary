import app.phoenixshell.monetary.Currency;
import app.phoenixshell.monetary.Money;
import app.phoenixshell.monetary.StdMoney;
import app.phoenixshell.monetary.StdMoneyDisplay;
import app.phoenixshell.monetary.err.MonetaryException;

public class MoneyTest {

	public static void main(String[] args) {

		
		try {
			Money m1 = new StdMoney("6.8", Currency.AUD);

			Money m2 = new StdMoney("7.9", Currency.AUD);
			
			Money m3 = new StdMoney("11.98", Currency.AUD);
			
			Money total = m1.addAll(m2,m3);



			StdMoneyDisplay display = new StdMoneyDisplay();

			String printed= display.getDisplay(total);
			System.out.println(printed);
			
			
		} 
		catch (MonetaryException e) {
			e.printStackTrace();
		}



	}

}
