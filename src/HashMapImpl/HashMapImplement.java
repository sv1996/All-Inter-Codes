package HashMapImpl;


import java.util.ArrayList;
import java.util.LinkedList;

class Node<K, V> {

    private K key;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    private V value;


    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }


}

class HashMapNew<K, V> {
    private ArrayList<LinkedList<Node<K, V>>> buckets;
    private int capacity;
    private int size;

    public HashMapNew(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.buckets = new ArrayList<>(capacity);

        for (int i = 0; i < capacity; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return hashCode % capacity;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets.get(bucketIndex);



    bucket.add(new Node<K, V>(key, value));
        size++;

    }


}


public class HashMapImplement {


    public static void main(String[] args) {

    }
}
