import java.util.List;

public class Main {
    public static void main(String[] args) {

        StringListBox strings = new StringListBox();
        strings.addElement("Some string");
        strings.addElements(new String[]{"Another string", "Third one"});
        System.out.println(strings.getElements());

        PersonListBox persons = new PersonListBox();
        persons.addElement(new Person("Ann"));
        persons.addElements(new Person[]{new Person("Ben"), new Person("Den")});
        persons.getElements().forEach(System.out::println);

        Integer[] intsArr = new Integer[]{1, 2, 3};
        String[] strArr = new String[]{"Hello", "World"};

        print(intsArr);
        print(strArr);
        System.out.println("_".repeat(50));

        FruitBasket<Apple> appleBasket = new FruitBasket<>();
        FruitBasket<Orange> orangesBasket = new FruitBasket<>();

        appleBasket.addFruit(new Apple("Diamond Dew Apples", 50));
        appleBasket.addFruit(new Apple("Alyvinia Abalia", 100));
        orangesBasket.addFruit(new Orange("Spanish Oranges", 30));
        orangesBasket.addFruit(new Orange("Morning Oranges", 60));

        System.out.println(appleBasket.getFruits());
        System.out.println(appleBasket.getTotalQuantity());
        System.out.println(orangesBasket.getFruits());
        System.out.println(orangesBasket.getTotalQuantity());
        System.out.println("_".repeat(50));

        Forest<Tree> forest = new Forest<>();
        forest.trees.addAll(List.of(new Oak(), new Birch(), new Fir(), new Pine()));
        forest.printVariuosForest(forest.trees);
        System.out.println("_".repeat(50));

        Forest<Conifers> coniferForest = new Forest<>();
        coniferForest.trees.addAll(List.of(new Fir(), new Pine()));
        forest.printConiferForest(coniferForest.trees);
        System.out.println("_".repeat(50));







    }

    public static <T> void print(T[] elements) {
        for (T t: elements) {
            System.out.println(t);
        }
    }


}
