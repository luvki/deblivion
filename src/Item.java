public class Item extends Entity {
	private String category;
	private int weight;
	private int value;
	public Item(String name, String category, int weight, int value){
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
