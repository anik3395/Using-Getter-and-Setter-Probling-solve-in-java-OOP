public class Book {

       private String title;
       private String author;
       private double price;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Book(String author, double price, String title) {
        this.author = author;
        this.price = price;
        this.title = title;
    }

    public double getPrice() {
        return price;
    }
}
