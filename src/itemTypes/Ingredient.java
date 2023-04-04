package itemTypes;

public class Ingredient extends Item{
    Ingredient(String name, int value, int weight){
        super(name, "ingredients", value, weight, 0);
    }
}
