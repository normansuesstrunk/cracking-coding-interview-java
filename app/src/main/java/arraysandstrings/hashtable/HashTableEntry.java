package arraysandstrings.hashtable;

public class HashTableEntry<K, V> {

    K key;
    V value;

    public HashTableEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

}
