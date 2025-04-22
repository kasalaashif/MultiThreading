package friendsExchangingShoppingItemsUsingExchanger;

import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exchanger<List<Item>> exchanger = new Exchanger<>();
		Thread friend1 = new Friend1(exchanger);
		Thread friend2 = new Friend2(exchanger);
		
		friend1.start();
		friend2.start();
	}

}
