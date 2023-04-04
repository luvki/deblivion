package itemTypes;

//itemTypes.Item: basic item class used for container management
	//game.Entity attribute hitPoints in this context is used as item condition e.g. weapon health
public abstract class Item extends game.Entity {
	//category: item category used in sorting
	private String category;
	private int value;
	private int weight;
	private int modifier;
	public Item(String name, String category, int value, int weight, int modifier){
		//item maxHitPoints is always 100
		super(name, 100);
		this.category = category;
		this.value = value;
		this.weight = weight;
		this.modifier = modifier;
	}
	public String getCategory(){
		return category;
	}
	public int getValue(){
		return value;
	}
	public int getWeight(){
		return weight;
	}
	public int getModifier(){
		return modifier;
	}
}
