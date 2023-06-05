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


        MyMap<DnsProvider, DnsServer> dnsMap = new MyMap<>();
        dnsMap.setPair(DnsProvider.GOOGLE, new DnsServer("8.8.8.8", "8.8.4.4"));
        dnsMap.setPair(DnsProvider.CLOUDFLARE, new DnsServer("1.1.1.1.", "1.0.0.1"));

        DnsServer googleDns = dnsMap.getPair(DnsProvider.GOOGLE);
        System.out.println(googleDns);

        MyMap<String, String> stringMap = new MyMap<>();
        stringMap.setPair("Labas", "Hello");
        stringMap.setPair("Pasaulis", "World");

        String labas = stringMap.getPair("Labas");
        System.out.println(labas);
        System.out.println("_".repeat(50));

        ListOfNumbers list1 = new ListOfNumbers();
        list1.addNumber(10.7);
        list1.addNumber(3.6);
        list1.addNumber(1.3);
        System.out.println(list1.getAverage());

        ListOfNumbers list2 = new ListOfNumbers();
        list2.addNumber(22.3);
        list2.addNumber(100.4);
        list2.addNumber(2.2);
        System.out.println(list2.getAverage());


        ListOfNumbers list3 = new ListOfNumbers();
        list3.addNumber(1.1);
        list3.addNumber(3.3);
        list3.addNumber(1.9);
        System.out.println(list3.getAverage());


        System.out.println(findWithMaxAverage(list1, list2, list3));



    }

    public static <T> void print(T[] elements) {
        for (T t: elements) {
            System.out.println(t);
        }
    }

    public static ListOfNumbers findWithMaxAverage(ListOfNumbers...listsList) {
        double max = Double.MIN_VALUE;
        ListOfNumbers biggest = new ListOfNumbers();
        for (ListOfNumbers list: listsList) {
            if(list.getAverage() > max) {
                max = list.getAverage();
                biggest = list;
            }
        }
        return biggest;
    }


}
