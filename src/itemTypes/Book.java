package itemTypes;

public class Book extends Item{
    Book(String name, int value, int weight){
        super(name, "books", value, weight, 0);
    }
}
