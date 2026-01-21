package Javaoop.A25Aggregations;

public class Main {
    public static void main(String[] args) {
        
        // Aggregations = Represents a "has-a" relationship between objects.
        //                One object contains another object as part of its structure,
        //                but the contained object/s can exist independently

        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books = {book1, book2, book3};

        //Ex.1
        System.out.println(book1.displayInfo()); // The Fellow of the Ring (423 pages)

        //Ex.2
         for(Book book : books){
            System.out.println(book.displayInfo());
        }

        //Ex.3
        
        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();

        /*
          The 1897 NYC Public Library
          Books Available:
          The Fellow of the Ring (423 pages)
          The Two Towers (352 pages)
          The Return of the King (416 pages)
        */

    }
}
