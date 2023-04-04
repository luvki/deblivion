package game;

//game.Entity: base object. parent of every object in the game world
public abstract class Entity {
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
	//healForXPoints: heals for X points, if this would exceed maxHitPoints calls healFully
	public void healForXPoints(int amountToHeal){
		if(amountToHeal > 0){
			if(amountToHeal + hitPoints > maxHitPoints){
				healFully();
			}else{
				hitPoints += amountToHeal;
			}
		}
	}
	//healFully: sets hitPoints to maxHitPoints
	public void healFully(){
		hitPoints = maxHitPoints;
	}
}
