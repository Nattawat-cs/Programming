package Javaoop.A25Aggregations;

public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.books = books;
        this.year = year;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Book Available: ");
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    }
    
}
