//Item: basic item class used for container management
	//Entity attribute hitPoints in this context is used as item condition e.g. weapon health
public class Item extends Entity {
	//category: item category used in sorting
	private String category;
	private int weight;
	private int value;
	public Item(String name, String category, int weight, int value){
		//item maxHitPoints is always 100
		super(name, 100);
		this.category = category;
		this.weight = weight;
		this.value = value;
	}
	public String getCategory(){
		return category;
	}
	public int getWeight(){
		return weight;
	}
	public int getValue(){
		return value;
	}
}
