package LinkedlList;

import java.util.ArrayList;
import java.util.Objects;

class Map {
    static ArrayList<Node> al = new ArrayList<>(16);
    int capacity;
    int[] array = new int[capacity];
    int length;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getLength() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setLength(int length) {
        this.length = length;
    }
}


class Node {
    int hash;

    public int getHash() {
        return hash;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    String key;
    int value;
    Node next = null;

    public Node(int hash, String key, int value, Node next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }


}


public class ListImplMain {

    public static int getHash(String key) {

        return Objects.hash(key);
    }

    public static boolean equal(Object o) {

        return Objects.equals(null, o);

    }


    public static Object put(String key, Integer value, Node node) {
        Map m = new Map();
        int n = m.getCapacity();
        int index = getHash(key) & (n - 1);
        Node currentNode = null;
        for (int i = 0; i < m.getLength(); i++) {
            if (i == index) {
                currentNode = push(node);
            }
        }
        return currentNode;
    }

    private static Node push(Node node) {
        ArrayList<Node> al = new ArrayList<>(16);
        al.add(node);
        Node newNode = al.get(0);
        return newNode;
    }


    public static Integer get(String key, Node node) {

        Map m = new Map();
        int n = m.getCapacity();
        int index = getHash(key) & (n - 1);

        // iteration\
        ArrayList<Node> newList = new ArrayList<>(16);
        for (Node uniqueNode : newList) {
            // equal and hashcode
            if (Objects.equals(key, uniqueNode.getKey()) && (Objects.hash(key) == Objects.hash(uniqueNode.getKey()))) {
                return uniqueNode.getValue();

            }

        }

        return null;
    }


    public static void main(String[] args) {
        String key = "shivam";
        Integer age = 10;
        String key2 = "rohan";
        Integer age1 =12;
        int hash = getHash(key);
        Node node1 = new Node(hash, key, age, null);
        put(key, age, node1);
        int value = get(key, node1);
        System.out.println(value);
    }


}
