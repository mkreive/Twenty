import java.util.ArrayList;
import java.util.List;

public class FruitBasket<T extends Fruit> {
    public List<T> fruitList;

    public FruitBasket() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public int getTotalQuantity() {
        int total = 0;
        for (T fruit: fruitList) {
           total += fruit.quantity;
        }
        return total;
    }

    public List<T> getFruits() {
      return fruitList;
    }


}
