package itemTypes;

public class Potion extends Item{
    Potion(String name, int value, int weight){
        super(name, "potions", value, weight, 0);
    }
}
