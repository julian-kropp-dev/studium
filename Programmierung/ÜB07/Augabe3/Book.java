package ÜB07.Augabe3;

public class Book {

    // TITLE
    private String title = "";

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        title = value;
    }

    // AUTHOR
    private String author = "";

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String value) {
        author = value;
    }

    // ISBN
    private String isbn = "";

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String value) {
        isbn = value;
    }

    // PRICE
    private double price = 0D;

    public double getPrice() {
        return price;
    }

    public void setPrice(double value) {
        price = value;
    }

    // PUBLISH
    public void publish(String _isbn, double _price) {
        isbn = _isbn;
        price = _price;
    }
}
