import java.util.*;

public class dataStructure {
    public static void main(String[] args) {
        // //declare the array list.
        // ArrayList<String> names = new ArrayList<String>();
        // //Add item to array.
        // names.add("John");
        // names.add("Heather");
        // names.add("Joe");
        // //Add item to specific index.It will move item to next index.
        // names.add(1, "Ri-ri");

        // System.out.println(names);
        // System.out.println(names.get(1));

        // //Remove item
        // names.remove("Ri-ri");
        // System.out.println(names);

        // //get the size of an array list
        // System.out.println(names.size());

        // //remove all item inside array list.
        // names.clear();
        // System.out.println("Size of the array: " + names.size());

        // // Create a new string
        // String myString = "I really love icecream!";

        // // Create another string that holds the split version of the first
        // String str[] = myString.split(" ");

        // // Use the List class to create a new ArrayList
        // List<String> arrayString = new ArrayList<String>();

        // // Store the contents of our split string as elements in
        // // arrayString using the Array.asList to convert the string into an array
        // arrayString = Arrays.asList(str);
        // // =>[I, really, love, icecream!] Turns the string myString into an array
        // System.out.println(arrayString);

        // ArrayList<String> fruitList = new ArrayList<String>();
        // fruitList.add("Apple");
        // fruitList.add("Banana");
        // fruitList.add("Grape");

        // for(String fruit: fruitList) {
        // System.out.println(fruit);
        // }
        // person = {Joan=22, Daniel=42, Anna=34}

        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Joan", 22);
        people.put("Daniel", 42);
        people.put("Anna", 34);

        // loop through the hash map and return each key/value pair
        for (Map.Entry<String, Integer> person : people.entrySet()) {
            String key = person.getKey();
            Integer value = person.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
