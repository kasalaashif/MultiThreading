package friendsExchangingShoppingItemsUsingExchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Friend2 extends Thread{
	List<Item> itemsList = new ArrayList<>();
	Exchanger<List<Item>> exchanger;
	
	public Friend2(Exchanger<List<Item>> exchanger) {
		this.exchanger = exchanger;
	}
	
	public List<Item> buyItems() {
		for(int i = 11; i <= 20; i++) {
			Item item = new Item();
			item.setItemName("Item: " + i);
			itemsList.add(item);
		}
		return itemsList;
	}
	public void printExchangedItems(List<Item> receivedItems) {
		System.out.println("Exchanged from Friend1: ");
		for(Item item: receivedItems)
			System.out.println(item.getItemName());
	}
	public void run() {
		List<Item> friend2Items = buyItems();
		try {
			List<Item> receivedItems = exchanger.exchange(friend2Items);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
