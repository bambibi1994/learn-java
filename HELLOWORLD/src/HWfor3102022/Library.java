package HWfor3102022;
import java.util.ArrayList;

public class Library{
    String Address;
    ArrayList<Book> bookCatalog = new ArrayList<Book>();

    // Add the missing implementation to this class
    public Library(String Address) {
        this.Address = Address;
    }

    public void addBook(Book newBook) {
        this.bookCatalog.add(newBook);
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println(this.Address);
    }

    public void borrowBook(String bookTitle) {
       int index = 0;
       int maxIndex = bookCatalog.size() - 1;
       //check if library have any book at all.
       if (maxIndex < 0) {
           System.out.println("Sorry, this book is not in our catalog.");
       }

       for (Book a: bookCatalog) {
           //Check to see if book is available
           if (bookTitle.equals(a.getTitle())) {
               if (a.isBorrowed()) {
                   System.out.println("Sorry, this book is already borrowed.");
               } else {
                   a.borrowed();
                   System.out.println("You successfully borrowed " + a.getTitle());
               }
           }
           //
           if (!bookTitle.equals(a.getTitle()) && index == maxIndex ) {
               System.out.println("Sorry, this book is not in our catalog.");
           } else if( index < maxIndex) {
               index++;
           }
       }
    }

    public void printAvailableBooks() {
        if (bookCatalog.size() == 0) {
            System.out.println("No book in catalog.");
        } else {
            for (Book a: bookCatalog) {
                if (!a.isBorrowed()){
                    System.out.println(a.getTitle());
                }
            }
        }
    }

    public void returnBook(String bookTitle) {
        for (Book a: bookCatalog) {
            //If book already borrowed and have same names as returning book
            //then book is marked as return.
            if (a.isBorrowed() && bookTitle.equals(a.getTitle())){
                a.returned();
                System.out.println("You successfully returned " + a.getTitle());
            }
        }
    }


    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 