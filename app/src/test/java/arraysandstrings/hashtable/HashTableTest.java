package arraysandstrings.hashtable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HashTableTest {

    HashTable<String, Integer> hashTable;
    int maxSize = 3;

    @BeforeEach
    void beforeEach() {
        hashTable = new HashTable<>(maxSize);
    }

    @Test
    void testHashTable() {

        var entries = Arrays.asList(
                new HashTableEntry<>("one", 1),
                new HashTableEntry<>("two", 2),
                new HashTableEntry<>("tree", 3),
                new HashTableEntry<>("four", 4));

        // add all entries to the HashTable
        entries.forEach(hashTableEntry -> hashTable.add(hashTableEntry.getKey(), hashTableEntry.getValue()));

        // check entries in the hashtable
        entries.forEach(hashTableEntry -> assertEquals(hashTableEntry.getValue(), hashTable.get(hashTableEntry.getKey())));
    }
}
