public class ItemListEntry {
	private Item item;
	private int amount;

	public ItemListEntry(Item item) {
		this.item = item;
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
