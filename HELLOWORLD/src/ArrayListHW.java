import java.util.*;

public class ArrayListHW {
    public static void main(String[] args) {
        //sum of the given array.
        int array[] = {2,7,6,8,12,1};
        int sum = sumArray(array);
        System.out.println(sum);
        //What is the output.
        output();
        //array from size, power.
        ArrayList<Integer> myArray = toPower(4, 2);
        System.out.println(myArray);
    }

    // Write a program to sum all the values of a given Array in Java. 
    public static int sumArray(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // What is the output?
    public static void output() {
        double[] exampleArray = { 1, 5, 6, 5, 4, 1 };
        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i < exampleArray.length; i++) {
            if (exampleArray[i] > maximum) {
                maximum = exampleArray[i];
                index = i;
            }
        }
        System.out.println(index);
        // =>> Output = 2. 2 is the index of largest number in array above.
    }

    // Write a public static method called "toPower" that takes in as parameters two
    // integers called size and power.
    // The method should return an array of size "size" with each array index raised
    // to the value of "power." So, for example,
    // if we passed in "size = 4" and "power = 2" to the "toPower," the method
    // should return the following result: [0,1,4,9].
    public static ArrayList<Integer> toPower(int size,int power) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            myArray.add((int) Math.pow(i, power));
        }
        return myArray;
    }
}
