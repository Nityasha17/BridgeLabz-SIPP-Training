package OOPS_Keywords_Instances;

public class Book {
    private String title;
    private String author;
    private final String isbn; // final

    private static String libraryName = "City Central Library"; // static

    public Book(String title, String author, String isbn) {
        this.title = title; // this
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBookDetails() {
        if (this instanceof Book) { // instanceof
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}
