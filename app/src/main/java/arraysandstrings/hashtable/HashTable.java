package arraysandstrings.hashtable;

import java.util.LinkedList;

public class HashTable<K, V> {

    int maxSize;

    LinkedList<HashTableEntry<K, V>>[] buckets;

    public HashTable(int maxSize) {
        buckets = new LinkedList[maxSize];
        this.maxSize = maxSize;
    }

    public void add(K key, V value) {
        // calculate hash function
        var entry = new HashTableEntry<>(key, value);
        var index = indexHashFunction(entry.getKey());
        // generate the linked list if there isn't any at this index
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        buckets[index].add(entry);
    }

    public V get(K key) {
        var index = indexHashFunction(key);
        if (buckets[index] == null) {
            return null;
        }
        for (HashTableEntry<K, V> entry : buckets[index]) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public int indexHashFunction(K key) {
        return key.hashCode() % this.maxSize;
    }
}
