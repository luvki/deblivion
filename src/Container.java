import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Container extends Entity {
	private LinkedHashMap<String, List<ItemListEntry>> categoryListsHashMap;
	private int maxEncumbrance;
	private int encumbrance;
	public Container(String name, int maxEncumbrance){
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
		this.maxEncumbrance = maxEncumbrance;
		setEncumbrance();
	}
	private void sortListEntries(){
		for(String categoryName : categoryListsHashMap.keySet()){
			categoryListsHashMap.get(categoryName).sort(
					(entry1, entry2) -> entry1.getItem().getName().compareTo(entry2.getItem().getName()));
		}
	}
	private void setEncumbrance(){
		int encumbrance = 0;
		for(String categoryName : categoryListsHashMap.keySet()) {
			for (ItemListEntry entry : categoryListsHashMap.get(categoryName)) {
				encumbrance += (entry.getItem().getWeight() * entry.getAmount());
			}
		}
		this.encumbrance = encumbrance;
	}
	public LinkedHashMap<String, List<ItemListEntry>> getCategoryListsHashMap(){
		return categoryListsHashMap;
	}
	public int getMaxEncumbrance(){
		return maxEncumbrance;
	}
	public int getCurrentEncumbrance(){
		return encumbrance;
	}
	public boolean addItem(Item item) {
		for(String categoryName : categoryListsHashMap.keySet()) {
			if(item.getCategory().equals(categoryName)){
				for(ItemListEntry entry : categoryListsHashMap.get(categoryName)){
					if(entry.getItem().getName().equals(item.getName())){
						if(entry.getAmount() < 999){
							int index = categoryListsHashMap.get(categoryName).indexOf(entry);
							categoryListsHashMap.get(categoryName).get(index).increaseAmountByOne();
							sortListEntries();
							setEncumbrance();
							return true;
						}else{
							return false;
						}
					}
				}
				categoryListsHashMap.get(categoryName).add(new ItemListEntry(item));
				sortListEntries();
				setEncumbrance();
				return true;
			}
		}
		return false;
	}
	public int addItemXTimes(Item item, int amountToAdd) {
		int amountAdded = 0;
		while(amountAdded < amountToAdd){
			if(addItem(item)){
				amountAdded++;
			}else{
				return amountAdded;
			}
		}
		return amountAdded;
	}
	public boolean removeItemByName(String name){
		for(String categoryName : categoryListsHashMap.keySet()) {
			for(ItemListEntry entry : categoryListsHashMap.get(categoryName)){
				if(entry.getItem().getName().equals(name)){
					entry.decreaseAmountByOne();
					if(entry.getAmount() == 0){
						categoryListsHashMap.get(categoryName).remove(entry);
					}
					setEncumbrance();
					return true;
				}
			}
		}
		return false;
	}
	public int removeItemXTimesByName(String name, int amountToRemove){
		int amountRemoved = 0;
		while(amountRemoved < amountToRemove){
			if(removeItemByName(name)){
				amountRemoved++;
			}else{
				return amountRemoved;
			}
		}
		return amountRemoved;
	}
}