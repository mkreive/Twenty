import java.util.ArrayList;
import java.util.List;

public class StringListBox implements ListBox<String>{

    List<String> arr = new ArrayList<>();

    @Override
    public void addElements(String[] values) {
        arr.addAll(List.of(values));
    }

    @Override
    public void addElement(String value) {
        arr.add(value);
    }

    @Override
    public List<String> getElements() {
        return arr;
    }
}
