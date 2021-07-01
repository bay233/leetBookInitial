package data;


import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    int cap;
    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        int val = cache.get(key);
        makeRecently(key);
        return val;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.put(key, value);
            makeRecently(key);
        } else {
            cache.put(key, value);
        }
        if (cache.size() > cap) {
            Map.Entry<Integer, Integer> next = cache.entrySet().iterator().next();
            cache.remove(next.getKey());
        }
    }

    private void makeRecently(int key) {
        int val = cache.get(key);

        cache.remove(key);
        cache.put(key, val);
    }
}
