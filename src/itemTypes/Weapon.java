package itemTypes;

import itemTypes.Item;

public class Weapon extends Item {
    public Weapon(String name, int value, int weight, int modifier){
        super(name, "weapons", value, weight, modifier);
    }
}
