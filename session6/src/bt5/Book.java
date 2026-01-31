package bt5;
public class Book {

    private String id;
    private String title;
    private double price;

    public Book(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Mã sách: " + id);
        System.out.println("Tên sách: " + title);
        System.out.println("Giá: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("BK001", "Lập trình Java", 75000);
        book.displayInfo();
    }
}
