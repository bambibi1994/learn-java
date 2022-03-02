import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        // /*Use the variables below to compose the
        // following paragraph: name, adjective,
        // verbOne, verbTwo, number, yourName
        // Dear name,
        // You are adverb adjective
        // and I want to be your noun! I want to go
        // to the nounTwo with you in number days.
        // Sincerely, yourName */

        // Scanner input = new Scanner(System.in);

        // System.out.println("What is your name: ");
        // String name = input.nextLine();

        // System.out.println("What is your adverb adjective: ");
        // String adverbAdjective = input.nextLine();

        // System.out.println("What is your first noun: ");
        // String nounOne = input.nextLine();

        // System.out.println("What is your second noun: ");
        // String nounTwo = input.nextLine();

        // System.out.println("What is your name: ");
        // String yourName = input.nextLine();

        // System.out.println("What is your number: ");
        // int num = input.nextInt();

        // System.out.println("Dear, " + name
        // +System.lineSeparator()
        // +"You are " + adverbAdjective
        // + " and I want to be your " + nounOne
        // + "! I want to go to the " + nounTwo
        // + " with you in " + num + " days."
        // +System.lineSeparator()
        // + "Sincerely, " + yourName);

        // input.close();

        Scanner userInput = new Scanner(System.in);

        int ageLimit = 18;

        System.out.println("How old are you?");

        int age = Integer.parseInt(userInput.nextLine());

        if (age < ageLimit) {
            System.out.println("You are too young! Sorry!");
            System.exit(0);
        } else {
            // Program continues as normal because they past the age test!
        }

        userInput.close();
    }
}
