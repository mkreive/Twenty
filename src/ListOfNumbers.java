import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    List<Double> listOfDoubles;

    public ListOfNumbers() {
        listOfDoubles = new ArrayList<>();
    }

    public void addNumber(Double number) {
        listOfDoubles.add(number);
    }

    public double getAverage()  {
        double sum = 0;
        for (double num: listOfDoubles) {
            sum += num;
        }
        return sum / listOfDoubles.size();
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "listOfDoubles=" + listOfDoubles +
                '}';
    }
}
