import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyMap <K, V extends Pair> {
    List<Pair> pairList;

    HashMap<K, V> myMap;

    public MyMap() {
        myMap = new HashMap<>();
        pairList = new ArrayList<>();
    }

    public void setPair(K key, V value) {
        myMap.put(key, value);
    }

    public V getPair(K key) {
        return myMap.get(key);
    }
}
