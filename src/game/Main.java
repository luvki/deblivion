package game;

import itemTypes.Apparel;
import itemTypes.Gold;
import itemTypes.Item;
import itemTypes.Weapon;

import java.util.ArrayList;
public class Main {
	static private Item[] items;
	public static void main(String[] args) {
		items = new Item[6];
		items[0] = new Weapon("Iron Battleaaaaaaaaaaaaaaaaaaaaaaaaa", 20, 20, 1);
		items[1] = new Apparel("Silver Helmet", 20, 10, 300);
		items[2] = new Apparel("Silver Helme4", 20, 10, 300);
		items[3] = new Apparel("Silver Helme3", 20, 10, 300);
		items[4] = new Apparel("Silver Helme2", 20, 10, 300);
		items[5] = new Apparel("Silver Helme1", 20, 10, 300);


		invTest();
	}
	static private void invTest(){
		Container inventory = new Container("TEST INVENTORY");
		Gold gold = new Gold();
		inventory.addItemXTimes(gold, 1209);
		for(Item item: items){
			inventory.addItemXTimes(item, 5);
		}
		printContainerContents(inventory.getContainerContentsStringArrayList());
		System.out.println("encumbrance: " + inventory.getEncumbrance() + "/" + "blob");
	}
	static private void printContainerContents(ArrayList<String> contents){
		for(String invEntryString:contents){
			System.out.println(invEntryString);
		}
	}
}