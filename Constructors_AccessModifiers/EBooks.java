package OOPS_Constructors_AccessModifiers;


public class EBooks extends Books {

    public EBooks(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBook() {
        System.out.println("EBook ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }
}
