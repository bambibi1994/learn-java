import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        // //#6 Using Variables.

        // //primitive type variables.
        // int myNumber = 88;
        // short myShort = 847;
        // long myLong = 9797;

        // double myDouble = 7.3243;//The is no long version of double.
        // float myFloat = 324.3f;//This is short version of double.

        // char myChar = 'n';//can hold 1 single unicode character.
        // boolean myBoolean = true;//can gold true/false;

        // byte myByte = 127;//can hold 8bit character.

        // System.out.println(myNumber);
        // System.out.println(myShort);
        // System.out.println(myLong);
        // System.out.println(myDouble);
        // System.out.println(myFloat);
        // System.out.println(myChar);
        // System.out.println(myBoolean);
        // System.out.println(myByte);

        // //#7 Working with Text.
        // int myInt = 7;//primitive variables.

        // String text = "Hello";//String is a object can hold group of texts.
        // String blank = " ";
        // String name = "Bob";

        // String greeting = text + blank + name;//you can add string together.

        // System.out.println(greeting);
        // System.out.println("Hello" + " " + "Bob");
        // System.out.println("My interger is: " + myInt);

        // double myDouble= 7.8;
        // System.out.println("My number is: " + myDouble + ".");

        // //#8 While loops.
        // int value = 0;
        // boolean loop = true;
        // boolean loop1 = 4 < 5;//still work as 4 is less than 5.
        // boolean loop2 = value < 20;//return true.

        // System.out.println(loop);
        // while(value < 10) {
        // System.out.println("Hello");
        // value = value + 1;//addition to value to stop it from running forever.
        // }

        // //#9 For loops.
        // for(int i = 0; i < 5; i++) {
        // // System.out.println("Hello");
        // // System.out.println("The value of i is: " + i);
        // System.out.printf("The value of i is: %d\n", i);//%d replace variable after
        // comma, \n skip a lines
        // }

        // //#11 Getting User Input.
        // //Create scanner object.
        // Scanner input = new Scanner(System.in);

        // //Output the prompt.
        // //System.out.println("Enter a line of text: ");
        // //System.out.println("Enter an integer: ");
        // System.out.println("Enter a floating point value: ");

        // //Wait for user to enter a line of text.
        // //String line = input.nextLine();//get a string.
        // //int value = input.nextInt();//create an error if input is not integer.
        // double value = input.nextDouble();

        // //Tell them what they entered.
        // //System.out.println("You entered: " + line);
        // System.out.println("You entered: " + value);

        // //#12 Do..While
        // Scanner scanner = new Scanner(System.in);

        // /* Multiple lines comments.

        // System.out.println("Enter a number: ");
        // int value = scanner.nextInt();

        // while(value != 5) {
        // System.out.println("Enter a number: ");
        // value = scanner.nextInt();//already declare no need to add int at beginning.
        // }*/

        // int value = 0;
        // do {//always do 1 times until condition is met.
        // System.out.println("Enter a number: ");
        // value = scanner.nextInt();//variable only exist in the bracket.
        // } while(value != 5);
        // System.out.println("Got 5!");

        // // #13 Switch
        // // Switch use to check for specific condition.
        // Scanner input = new Scanner(System.in);

        // System.out.println("Please enter a command: ");
        // String text = input.nextLine();

        // switch (text) {// you can have as many case as you want.
        //     // switch case is text sensitive.
        //     case "start":
        //         System.out.println("Machine started!");
        //         break;

        //     case "stop":
        //         System.out.println("Machine stopped!");
        //         break;

        //     default:
        //         // Always show when non of the case is met.
        //         // default always go to the bottom of switch statement.
        //         System.out.println("Command not recognized!");
        // }

        // // #14 Arrays
        // int value = 7;//Store single interger.
        // int[] values;//Store multiple interger as a preference.
        
        // values = new int[3];//add 3 to a preference named values.

        // System.out.println(values[0]);//First index is a 0.
        // //Java always add default value of 0 at its index.
        // values[0] = 10;
        // values[1] = 10;
        // values[2] = 10;

        // System.out.println(values[0]);
        // System.out.println(values[1]);
        // System.out.println(values[3]);

        // for(int i=0; i < values.length; i++) {
        //     System.out.println(values[i]);
        // }

        // int[] numbers = {5, 6, 7};//initial array with its values.

        // for(int i=0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        // // #15 Arrays of strings
        // String[] words = new String[3];//you need to add number of element in String Array.

        // words[0] = "Hello";
        // words[1] = "to";
        // words[2] = "you";

        // System.out.println(words[2]);

        // String[] fruits = {"apple", "banana", "pear", "kiwi"};

        // for(String fruit: fruits) {
        //     System.out.println(fruit);
        // }

        // int value = 123;//create enough memory for interger

        // String text = null;//Do not create memory instead create a perference to the value.
        // //default value is null.

        // System.out.println(text);

        // String[] texts = new String[2];
        // System.out.println(texts[0]);

        // texts[0] = "one";

        // // #53 Array List
        // //Can not use primitive for type of value.
        // ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        // //Adding
        // numbers.add(10);
        // numbers.add(100);
        // numbers.add(40);
        // //Retrieving
        // System.out.println(numbers.get(0));

        // //indexed for loop iteration.
        // System.out.println("\nIteration #1: ");
        // for(int i=0; i < numbers.size(); i++) {
        //     System.out.println(numbers.get(i));
        // }

        // System.out.println("\nIteration #2: ");
        // for(Integer value: numbers) {
        //     System.out.println(value);
        // }

        // //Remoning items (careful!)
        // numbers.remove(numbers.size() -1);

        // //This is very slow, it will create copy of each item until it reach first items.
        // numbers.remove(0);
        // System.out.println("\nIteration #2: ");
        // for(Integer value: numbers) {
        //     System.out.println(value);
        // }

        // //List interface ...
        // //Link list.
        // List<String> values = new ArrayList<String>();
    }
}
