import java.util.ArrayList;
import java.util.List;

class FruitCollection {
    private List<String> fruits;
    
    public FruitCollection() {
        fruits = new ArrayList<>();
    }
    
    public void addFruit(String fruit) {
        fruits.add(fruit);
    }
    
    public void removeFruit(String fruit) {
        fruits.remove(fruit);
    }
    
    public void displayFruits() {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    
    public boolean isFruitInList(String fruit) {
        return fruits.contains(fruit);
    }
}