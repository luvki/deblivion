import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
	static private Item[] items;
	static private Container inventory;
	public static void main(String[] args) {
		items = new Item[6];
		items[0] = new Item("Iron Battleaaaaaaaaaaaaaaaaaaaaaaaaa", "Weapons", 20, 15);
		items[1] = new Item("Custom Wand", "Weapons", 10, 300);
		items[2] = new Item("Human Toe", "Ingredients", 1, 10);
		items[3] = new Item("Crab Meat", "Ingredients", 1, 2);
		items[4] = new Item("Crab Meat", "Ingredients", 1, 2);
		items[5] = new Item("The Bible", "Books", 3, 100);
		invTest();
	}
	static private void invTest(){
		inventory = new Container("TEST INVENTORY", 300);
		Gold gold = new Gold();
		inventory.addItem(gold);
		printInvContent();
	}

	static private void printInvContent(){
		LinkedHashMap<String, List<ItemListEntry>> invContents = inventory.getCategoryListsHashMap();
		String itemNameString = "";
		String minusesToAdd = "";
		int itemNameStringMaxLength = 25;
		String amountString = "";

		System.out.println(inventory.getName() + ": ");

		for(String categoryName : invContents.keySet()){
			System.out.println("    " + categoryName + ": ");
			for(ItemListEntry entry : invContents.get(categoryName)){
				itemNameString = entry.getItem().getName();
				minusesToAdd = "";
				if(itemNameString.length() <= itemNameStringMaxLength){
					itemNameString += genUnderscoreString(itemNameStringMaxLength - itemNameString.length());
				}else{
					itemNameString = itemNameString.substring(0, itemNameStringMaxLength-3);
					itemNameString += "...";
				}
				System.out.print(itemNameString);

				System.out.println(genUnderscoreString(4 - (new String("" + entry.getAmount()).length())) + entry.getAmount());
			}
		}
		System.out.println("Encumbrance: " + inventory.getCurrentEncumbrance() + "/" + inventory.getMaxEncumbrance());
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

	static private String genUnderscoreString(int length){
		String string = "";
		for(int i = 0; i < length; i++){
			string += "_";
		}
		return string;
	}
}