package bt3;
public class Main {
    public static void main(String[] args) {

        // Tạo sản phẩm
        Product p1 = new Product(
                "SP01",
                "Laptop Dell",
                15_000_000
        );

        // Hiển thị ban đầu
        p1.displayInfo();

        // Thử set giá KHÔNG hợp lệ
        p1.setPrice(-5_000_000);

        // Giá không thay đổi
        p1.displayInfo();

        // Set giá hợp lệ
        p1.setPrice(18_000_000);

        // Giá được cập nhật
        p1.displayInfo();
    }
}
