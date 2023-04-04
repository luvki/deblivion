package game;

import itemTypes.Item;

//game.ItemListEntry: list entry object containing an item and the amount of that item stored
	//used in container management
public class ItemListEntry {
	//item: item held in list entry
	private Item item;
	//amount: amount of the item
	private int amount;

	public ItemListEntry(Item item) {
		this.item = item;
		//on object creation amount is always one
		this.amount = 1;
	}

	public Item getItem() {
		return item;
	}

	public int getAmount() {
		return amount;
	}

	public void increaseAmountByOne(){
		amount++;
	}
	public void decreaseAmountByOne(){
		amount--;
	}
}
