import java.util.HashMap;

public class MyMap <K, V> {
    HashMap<K, V> myMap;

    public MyMap() {
        myMap = new HashMap<>();
    }

    public void setPair(K key, V value) {
        myMap.put(key, value);
    }

    public V getPair(K key) {
        return myMap.get(key);
    }
}
