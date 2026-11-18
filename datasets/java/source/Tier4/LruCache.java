package datasets.java.source.Tier4;

import java.util.LinkedHashMap;

public class LruCache {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> cache = new LinkedHashMap<>(3, 0.75f, true);
        cache.put("A", 1);
        cache.put("B", 2);
        System.out.println("A=" + cache.getOrDefault("A", -1));
        System.out.println("B=" + cache.getOrDefault("B", -1));
        cache.put("C", 3);
        cache.remove("B");
        System.out.println("C=" + cache.getOrDefault("C", -1));
    }
}
