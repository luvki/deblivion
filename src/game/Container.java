package game;

import itemTypes.Item;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import toolbox.StringTools;

//game.Container: container objects are used as inventories and traditional containers such as chests.
	//items are saved inside an game.ItemListEntry object which is contained in an ArrayList depending on the
	//item.category attribute. these ArrayLists themselves are entries in the categoryListsHashmap which thus holds
	//all item information and can be interfaced with through methods defined below.
	//if the container object is used in an inventory context the maxEncumbrance parameter is needed to calculate
	//maxEncumbrance. if no maxEncumbrance is given maxEncumbrance is set to 0 equalling infinite maxEncumbrance.

public class Container extends Entity {
	//categoryListsHashMap: HashMap containing an ArrayList for each item category
	private LinkedHashMap<String, List<ItemListEntry>> categoryListsHashMap;
	//currentEncumbrance: equals the sum of the weights of all items in the container
	private int encumbrance;
	//game.Container: constructor initializes categoryListsHashMap and fills it with the ArrayLists.
	//then initializes currentEncumbrance using the setEncumbrance() method.
	public Container(String name){
		super(name, 1);
		categoryListsHashMap = new LinkedHashMap<String, List<ItemListEntry>>();
		categoryListsHashMap.put("weapons", 	new ArrayList<>());
		categoryListsHashMap.put("apparel", 	new ArrayList<>());
		categoryListsHashMap.put("apparatuses", new ArrayList<>());
		categoryListsHashMap.put("potions", 	new ArrayList<>());
		categoryListsHashMap.put("ingredients", new ArrayList<>());
		categoryListsHashMap.put("books", 		new ArrayList<>());
		categoryListsHashMap.put("keys", 		new ArrayList<>());
		categoryListsHashMap.put("stones", 		new ArrayList<>());
		categoryListsHashMap.put("misc", 		new ArrayList<>());
		categoryListsHashMap.put("gold", 		new ArrayList<>());
		setEncumbrance();
	}
	//sortListEntries: sorts category ArrayLists according to item names
	private void sortListEntries(){
		for(String categoryName : categoryListsHashMap.keySet()){
			//sort uses lambda expression to create comparator used to sort
			categoryListsHashMap.get(categoryName).sort(
					(entry1, entry2) -> entry1.getItem().getName().compareTo(entry2.getItem().getName()));
		}
	}
	//getContainerContentsStringArrayList: returns ArrayList containing container contents (item amounts, names and
	// 																						stats)
	//<<<<<<<<<<<<<<<container name>>>>>>>>>>>>>>	(container name is centered in 43 char long String)
	//amnt|----category name---|-val-|wgt|mod|-♥-	(columns mod and health aren't used depending on category)
	//XXXX|item name...........|XXXXX|XXX|XXX|XXX
	//encumbrance									(correct display of encumbrance, current defence and gold is
	// 												 handled on method call)
	//TODO: FINISH THIS, THEN ADD MODIFIER ATTRIBUTE TO ITEM CLASS THEN STREAMLINE THIS
	public ArrayList getContainerContentsStringArrayList(){
		//ArrayList containing String Arrays filled with item entries
		ArrayList<String> containerContents = new ArrayList<String>();
		containerContents.add(StringTools.center(this.getName(), 43, '<', '>'));
		//cycle through ArrayLists
		for(String categoryName : categoryListsHashMap.keySet()){
			if(categoryListsHashMap.get(categoryName).size() > 0) {
				if(!categoryName.equals("gold")){
					containerContents.add("amnt|" + StringTools.center(categoryName, 20, '-') +
							"|-val-|wgt|mod|-♥-");
				}

				switch (categoryName) {
					case "weapons":
					case "apparel":
						for(ItemListEntry itemEntry:categoryListsHashMap.get(categoryName)){
							containerContents.add(StringTools.alignRight("" + itemEntry.getAmount(), 4) +
									"|" + StringTools.alignLeft("" +
									itemEntry.getItem().getName(), 20, '.') +
									"|" + StringTools.alignRight("" +
									itemEntry.getItem().getValue(), 5, '.') +
									"|" + StringTools.alignRight("" +
									itemEntry.getItem().getWeight(), 3, '.') +
									"|" + StringTools.alignRight("" +
									itemEntry.getItem().getModifier(), 3, '.') +
									"|" + StringTools.alignRight("" +
									itemEntry.getItem().getHitPoints(), 3, '.'));
						}
						break;
					case "apparatuses":
					case "potions":
					case "ingredients":
					case "books":
					case "keys":
					case "stones":
					case "misc":
						for(ItemListEntry itemEntry:categoryListsHashMap.get(categoryName)){
							containerContents.add(StringTools.alignRight("" + itemEntry.getAmount(), 4) +
									"|" + StringTools.alignLeft("" +
									itemEntry.getItem().getName(), 20, '.') +
									"|" + StringTools.alignRight("" +
									itemEntry.getItem().getValue(), 5, '.') +
									"|" + StringTools.alignRight("" +
									itemEntry.getItem().getWeight(), 3, '.') +
									"|" + "   |   ");
						}
						break;
					case "gold":
						int sumGold = 0;
						for(ItemListEntry itemEntry:categoryListsHashMap.get(categoryName)){
							sumGold += itemEntry.getAmount();
						}
						containerContents.add("gold: " +sumGold);
						break;
				}
			}
		}
		return containerContents;
	}
	//getEncumbrance: used to show encumbrance
	public int getEncumbrance(){
		return encumbrance;
	}
	//addItem: adds new game.ItemListEntry to one ArrayList or increases amount in game.ItemListEntry based on item name
		//returns true or false depending on success
	public boolean addItem(Item item) {
		//cycle through category ArrayLists
		for(String categoryName : categoryListsHashMap.keySet()) {
			//if ArrayList matches item category
			if(item.getCategory().equals(categoryName)) {
				//cycle through ItemListEntries
				for(ItemListEntry entry : categoryListsHashMap.get(categoryName)) {
					//if item names match and amount game.ItemListEntry is < 999
					if(entry.getItem().getName().equals(item.getName()) && entry.getAmount() < 999) {
						//get index of matching game.ItemListEntry
						int index = categoryListsHashMap.get(categoryName).indexOf(entry);
						//and increase amount by one
						categoryListsHashMap.get(categoryName).get(index).increaseAmountByOne();
						//sort category lists, update encumbrance and return true
						sortListEntries();
						setEncumbrance();
						return true;
					}
				}
				//no entry with matching item name found or amount equals 999
				//create new game.ItemListEntry and add it to the category list
				categoryListsHashMap.get(categoryName).add(new ItemListEntry(item));
				//sort category lists, update encumbrance and return true
				sortListEntries();
				setEncumbrance();
				return true;
			}
		}
		//no matching category
		return false;
	}
	//addItemXTimes: adds given item x times returns number of items added
	public int addItemXTimes(Item item, int amountToAdd) {
		int amountAdded = 0;
		//as long as there are items to add
		while(amountAdded < amountToAdd){
			//try adding item
			if(addItem(item)){
				//if item was added: increase counter
				amountAdded++;
			}else{
				//if item couldn't be added: return amount of items added to stop infinite loops
				return amountAdded;
			}
		}
		return amountAdded;
	}
	//removeItemByName: removes item from category ArrayList based on given name
	public boolean removeItemByName(String name){
		//cycle through category ArrayLists
		for(String categoryName : categoryListsHashMap.keySet()) {
			//cycle through ItemListEntries
			for(ItemListEntry entry : categoryListsHashMap.get(categoryName)){
				//if names match
				if(entry.getItem().getName().equals(name)){
					//decrease amount
					entry.decreaseAmountByOne();
					//if amount equals zero
					if(entry.getAmount() == 0){
						//delete ArrayList entry
						categoryListsHashMap.get(categoryName).remove(entry);
					}
					//recalculate encumbrance
					setEncumbrance();
					//success returns true
					return true;
				}
			}
		}
		//if no item with matching name is found return false
		return false;
	}
	//removeItemXTimesByName: removes Items from category ArrayList based on given name X times
	public int removeItemXTimesByName(String name, int amountToRemove){
		int amountRemoved = 0;
		//as long as there are items to remove
		while(amountRemoved < amountToRemove){
			//try removing item
			if(removeItemByName(name)){
				//if item was added increase counter
				amountRemoved++;
			}else{
				//if item couldn't be removed: return amount of items removed to stop infinite loops
				return amountRemoved;
			}
		}
		return amountRemoved;
	}
	//setEncumbrance: sums up all item weights in inventory and sets currentEncumbrance
	private void setEncumbrance(){
		int encumbrance = 0;
		//cycles through ArrayLists in categoryListsHashMap
		for(String categoryName : categoryListsHashMap.keySet()) {
			//cycles through ItemListEntries in ArrayList
			for (ItemListEntry entry : categoryListsHashMap.get(categoryName)) {
				//adds weight of item multiplied by amount of items in game.ItemListEntry to currentEncumbrance
				encumbrance += (entry.getItem().getWeight() * entry.getAmount());
			}
		}
		this.encumbrance = encumbrance;
	}
}