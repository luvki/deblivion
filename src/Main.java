import java.util.ArrayList;
public class Main {
	static private Item[] items;
	public static void main(String[] args) {
		items = new Item[6];
		items[0] = new Item("Iron Battleaaaaaaaaaaaaaaaaaaaaaaaaa", "weapons", 20, 15);
		items[1] = new Item("Custom Wand", "weapons", 10, 300);
		items[2] = new Item("Human Toe", "ingredients", 1, 10);
		items[3] = new Item("Crab Meat", "ingredients", 1, 2);
		items[4] = new Item("Crab Meat", "ingredients", 1, 2);
		items[5] = new Item("The Bible", "books", 3, 100);
		invTest();
	}
	static private void invTest(){
		Container inventory = new Container("TEST INVENTORY");
		Gold gold = new Gold();
		inventory.addItem(gold);
		for(Item item: items){
			inventory.addItemXTimes(item, 5);
		}
		printContainerContents(inventory.getContainerContentsStringArrayList());
	}
	static private void printContainerContents(ArrayList<String> contents){
		for(String invEntryString:contents){
			System.out.println(invEntryString);
		}
	}
}