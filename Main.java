








import java.util.*;

public class Main {













    //initializng the map using HashMap
    public static void initializeMap(HashMap<String, Integer> map) {
        map = new HashMap<>();

    }
    /* public static void initializeMap1(TreeMap<String,Integer>map){
        map = new TreeMap<>();
    }
    public static void initializeMap2(LinkedHashMap<String,Integer>map){
        map = new LinkedHashMap<>();
    }*/
    public void addKey_Value(HashMap<String, Integer> map) {
        map = new HashMap<>();
        // Add key-value pair to the map
        map.put("One", 1);
        map.put("Two", 2);
    }






    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> e_Map = new HashMap<>();

        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many elements you want in the map");
        int n = scanner.nextInt();

        // Loop for to add key-value pairs
        for (int i = 0; i < n; i++) {
            // Get user input for key
            System.out.print("Enter key : ");
            String key = scanner.next();
            // Get user input for value
            System.out.print("Enter value: ");
            int value = scanner.nextInt();

            // Add the key-value pair to the map
            e_Map.put(key, value);

        }
        System.out.println(e_Map);


        System.out.println("enter the key to get the value");
        String key = scanner.next();
        if (e_Map.containsKey(key))
            System.out.println(e_Map.get(key));       // print the value associated with the key
            e_Map.remove(key);                       //remove the value associeted with the key
        System.out.println(e_Map);


        //System.out.println("Key: " + e_Map.get(key) + ", Value: " + e_Map.get(value));


        String[] keysArray = e_Map.keySet().toArray(new String[0]);
        Integer[] valuesArray = e_Map.values().toArray(new Integer[0]);

        Arrays.sort(valuesArray);
        System.out.println("Keys Array: " + Arrays.toString(valuesArray));
    }
}

