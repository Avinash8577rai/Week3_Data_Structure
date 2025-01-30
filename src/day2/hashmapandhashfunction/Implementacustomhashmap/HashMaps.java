package day2.hashmapandhashfunction.Implementacustomhashmap;
import java.util.*;
public class HashMaps {
    private static final int SIZE = 10;

    // Create an array of LinkedLists (each element is a linked list of key-value pairs)
    private LinkedList<Node>[] table;

    // Constructor
    public HashMaps() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to compute the index for a given key
    private int hash(int key) {
        return Integer.hashCode(key) % SIZE;
    }

    // Node to store key-value pairs
    private static class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Insert key-value pair into the map
    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Node> list = table[index];

        // Check if the key already exists, if so, update the value
        for (Node node : list) {
            if (node.key == key) {
                node.value = value;  // Update value
                return;
            }
        }

        // Otherwise, add a new node with the key-value pair
        list.add(new Node(key, value));
    }

    // Retrieve the value for a given key
    public int get(int key) {
        int index = hash(key);
        LinkedList<Node> list = table[index];

        // Search for the key in the linked list
        for (Node node : list) {
            if (node.key == key) {
                return node.value;  // Return the value if found
            }
        }

        return -1;  // Return -1 if the key doesn't exist
    }

    // Remove the key-value pair from the map
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Node> list = table[index];

        // Search and remove the node with the given key
        for (Node node : list) {
            if (node.key == key) {
                list.remove(node);  // Remove the node
                return;
            }
        }
    }

}
