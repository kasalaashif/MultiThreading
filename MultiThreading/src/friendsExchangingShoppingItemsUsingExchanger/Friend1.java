package friendsExchangingShoppingItemsUsingExchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Friend1 extends Thread{
	List<Item> itemsList = new ArrayList<>();
	
	Exchanger<List<Item>> exchanger;
	
	public Friend1(Exchanger<List<Item>> exchanger) {
		this.exchanger = exchanger;
	}
	
	public List<Item> buyItems() {
		for(int i = 1; i <= 10; i++) {
			Item item = new Item();
			item.setItemName("Item: " + i);
			itemsList.add(item);
		}
		return itemsList;
	}
	
	public void printExchangedItems(List<Item> receivedItems) {
		System.out.println("Exchanged from Friend2: ");
		for(Item item: receivedItems)
			System.out.println(item.getItemName());
	}
	
	public void run() {
		List<Item> friend1Items = buyItems();
		try {
			printExchangedItems(friend1Items);
			List<Item> receivedItems = exchanger.exchange(friend1Items);
			printExchangedItems(receivedItems);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
