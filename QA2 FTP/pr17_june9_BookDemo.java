/*
Write a Java class Book with following features:

        Instance variables :
        title for the title of book of type String.
        author for the author’s name of type String.
        price for the book price of type double.

        Constructor:
public Book (String title, Author name, double price): A constructor with parameters,
it creates the Author object by setting the fields to the passed values.

        Instance methods:
public void setTitle(String title): Used to set the title of a book.
public void setAuthor(String author): Used to set the name of the author of a book.
public void setPrice(double price): Used to set the price of a book.
public double getTitle(): This method returns the title of the book.
public double getAuthor(): This method returns the author’s name of the book.
public String toString(): This method printed out book’s details to the screen

        Write a separate class BookDemo with a main() method creates a Book titled “Developing Java Software” with
        authors Russel Winderand price 79.75. Prints the Book’s string representation to standard output (using System.out.println).
*/
class Book{
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
public class pr17_june9_BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Developing Java Software","Russel Winderand",79.75);
        System.out.println(myBook.toString());

    }
}
