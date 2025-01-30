package day2.hashmapandhashfunction.Implementacustomhashmap;

public class Main {
    public static void main(String[] args) {

            HashMaps map = new HashMaps();

            // Insert some key-value pairs
            map.put(1, 10);
            map.put(2, 20);
            map.put(100, 1000);

            // Retrieve and print values
            System.out.println("Value for key 1: " + map.get(1));  // Output: 10
            System.out.println("Value for key 2: " + map.get(2));  // Output: 20
            System.out.println("Value for key 100: " + map.get(100));  // Output: 1000

            // Remove a key-value pair
            map.remove(2);
            System.out.println("Value for key 2 after removal: " + map.get(2));  // Output: -1 (key 2 is removed)
        }
    }
