
class Book {
    protected String title;
    protected String author;
    protected double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nFiction Book Details:");
        super.displayDetails();
    }
}


class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nNon-Fiction Book Details:");
        super.displayDetails();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
  
        Fiction fictionBook = new Fiction("Harry Potter", "J.K. Rowling", 1000);
    
        NonFiction nonFictionBook = new NonFiction("The Art of War", "Sun Tzu", 700);
   
        fictionBook.displayDetails();
        nonFictionBook.displayDetails();
    }
}
