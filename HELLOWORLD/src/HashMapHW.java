import java.util.*;

public class HashMapHW {
    public static void main(String[] args) {
        // #1
        // Write a program that does the following:
        // Asks the user for 5 numbers
        Scanner userInput = new Scanner(System.in);

        // System.out.println("Enter Your First Number: ");
        // int number1 = Integer.parseInt(userInput.nextLine());
        // System.out.println("Enter Your Second Number: ");
        // int number2 = Integer.parseInt(userInput.nextLine());
        // System.out.println("Enter Your Third Number: ");
        // int number3 = Integer.parseInt(userInput.nextLine());
        // System.out.println("Enter Your Forth Number: ");
        // int number4 = Integer.parseInt(userInput.nextLine());
        // System.out.println("Enter Your Fifth Number: ");
        // int number5 = Integer.parseInt(userInput.nextLine());

        // // Stores them in an array list
        // ArrayList<Integer> numbers = new ArrayList<Integer>();
        // numbers.add(number1);
        // numbers.add(number2);
        // numbers.add(number3);
        // numbers.add(number4);
        // numbers.add(number5);
        // // Finds the sum, product, largest, and smallest of those numbers
        // int sum = 0;
        // int product = 1;
        // int largest = Integer.MIN_VALUE;
        // int smallest = Integer.MAX_VALUE;

        // for (Integer num : numbers) {

        // sum += num;
        // product *= num;

        // if (num > largest) {
        // largest = num;
        // }

        // if (smallest > num) {
        // smallest = num;
        // }

        // }

        // System.out.println("Sum is: " + sum);
        // System.out.println("Product is: " + product);
        // System.out.println("Largest is: " + largest);
        // System.out.println("Smallest is: " + smallest);

        // #2
        // You are a car dealer. Create a hash map of vehicles.
        // HashMap<String, String> vehicles = new HashMap<String, String>();
        // // The model is the Key, the make is the Value.
        // vehicles.put("Civic", "Honda");
        // vehicles.put("Accord", "Toyota");
        // vehicles.put("Mustang", "Ford");
        // // Ask the customer what car (model) they are looking for. Use the Hash Map to
        // // determine if you have that vehicle, and what make it is.
        // System.out.println("What Car model Do You want? ");
        // String selection = userInput.nextLine();
        // // (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over
        // // here...")
        // for (Map.Entry<String, String> car : vehicles.entrySet()) {
        //     String key = car.getKey();
        //     String value = car.getValue();
        //     if (key.equals(selection)) {
        //         System.out.println("Are you looking for a " + key + ".Our " + value + " Selection is over here.");
        //         break;
        //     } else {
        //         // System.out.println("There is no car match your selection.");
        //     }
        // }
        userInput.close();
    }
}
