import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
	static private Item[] items;
	static private Container inventory;
	public static void main(String[] args) {
		items = new Item[6];
		items[0] = new Item("Iron Battleaaaaaaaaaaaaaaaaaaaaaaaaa", "weapons", 20, 15);
		items[1] = new Item("Custom Wand", "weapons", 10, 300);
		items[2] = new Item("Human Toe", "ingredients", 1, 10);
		items[3] = new Item("Crab Meat", "ingredients", 1, 2);
		items[4] = new Item("Crab Meat", "ingredients", 1, 2);
		items[5] = new Item("The Bible", "books", 3, 100);
		invTest();

		//String[] test = {"asd"};

		//System.out.println(StringTools.center("my String is too long", 10));


	}
	static private void invTest(){
		inventory = new Container("TEST INVENTORY");
		Gold gold = new Gold();
		inventory.addItem(gold);
		for(Item item: items){
			inventory.addItemXTimes(item, 5);
		}
		ArrayList<String[]> invcontents = inventory.getContainerContentsStringArrayList();

		printInventoryContents(inventory.getContainerContentsStringArrayList());
	}
	static private void printInventoryContents(ArrayList<String> contents){
		for(String invEntryString:contents){
			System.out.println(invEntryString);
		}
	}

	/*static private void printInvContent(){
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
		System.out.println("Encumbrance: " + inventory.getEncumbrance());
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
	}*/
}