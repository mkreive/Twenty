import java.util.ArrayList;
import java.util.List;

public class Forest <T extends Tree> {
    public List<T> trees;

    public Forest() {
        trees = new ArrayList<>();
    }


    public void printVariuosForest(List<T> trees) {
        trees.forEach(tree -> {
            System.out.print(tree.getClass().getSimpleName());
             tree.has();
        });
    }

    public void printConiferForest(List<Conifers> trees) {
        trees.forEach(tree -> {
            System.out.print(tree.getClass().getSimpleName());
            tree.has();
        });
    }

    public void printBirchForest(List<Birch> trees) {
        System.out.println(trees.getClass().getSimpleName());
        trees.forEach(Birch::has);
    }
}
