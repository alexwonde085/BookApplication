public class Book {

    public String title;
    private String author;
    private String description;
    public double price;
    public boolean isInStock;

    public Book(){

        title="Fiction";
        author="Some Body";
        description="description of the book.";
        price=12.5;
        isInStock=true;
    }

    public Book(String title) {

        this.title = title;
    }

    public Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public Book(String title, double price, boolean isInStock) {
        this.title = title;
        this.price = price;
        this.isInStock = isInStock;
    }

    public Book(String title, String author, String description, double price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayText(String author, String title, String description){
        return "\nAuthor: "+author +"\n"+"Title: "+ title +"\n"+ "Description: "+description;
    }
}
