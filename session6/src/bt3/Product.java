package bt3;
public class Product {

    // ===== Thuộc tính (private – Encapsulation) =====
    private String productId;
    private String productName;
    private double price;

    // ===== Constructor =====
    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price); // kiểm soát giá ngay từ đầu
    }

    // ===== Getter =====
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // ===== Setter =====
    public void setProductId(String productId) {
        if (!productId.isEmpty()) {
            this.productId = productId;
        }
    }

    public void setProductName(String productName) {
        if (!productName.isEmpty()) {
            this.productName = productName;
        }
    }

    // Setter có kiểm soát dữ liệu
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Giá không hợp lệ! Giá phải > 0");
        }
    }

    // ===== Hiển thị thông tin =====
    public void displayInfo() {
        System.out.println("Mã SP: " + productId);
        System.out.println("Tên SP: " + productName);
        System.out.println("Giá bán: " + price);
        System.out.println("---------------------------");
    }
}
