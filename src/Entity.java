abstract class Entity {
	private String name;
	private int maxHitPoints;
	private int hitPoints;
	public Entity(String name, int maxHitPoints){
		this.name = name;
		this.maxHitPoints = maxHitPoints;
		hitPoints = maxHitPoints;
	}
	public String getName(){
		return name;
	}
	public int getMaxHitPoints(){
		return maxHitPoints;
	}
	public int getHitPoints(){
		return hitPoints;
	}
	public void healForXPoints(int amountToHeal){
		if(amountToHeal > 0){
			if(amountToHeal + hitPoints > maxHitPoints){
				hitPoints = maxHitPoints;
			}else{
				hitPoints += amountToHeal;
			}
		}
	}
	public void healFully(){
		hitPoints = maxHitPoints;
	}
}
