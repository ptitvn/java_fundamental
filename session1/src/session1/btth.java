import java.util.Scanner;


public class btth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookID;
        String title;
        double price;
        int quantity;
        boolean isAvailable;

        System.out.print("Nhập mã sách: ");
        bookID = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập tên sách: ");
        title = scanner.nextLine();

        System.out.print("Nhập giá nhập: ");
        price = scanner.nextDouble();

        System.out.print("Nhập số lượng: ");
        quantity = scanner.nextInt();

        System.out.print("Sách còn trong kho? (true/false): ");
        isAvailable = scanner.nextBoolean();

        double totalValue = price * quantity;
        boolean isLargeStock = quantity > 100;
        boolean canBorrow = isAvailable && quantity > 0;

        String status = isAvailable ? "Còn hàng" : "Hết hàng";

        System.out.println("\n===== BÁO CÁO TÌNH TRẠNG SÁCH =====");
        System.out.println("Mã sách: " + bookID);
        System.out.println("Tên sách: " + title);
        System.out.printf("Giá nhập: %.2f%n", price);
        System.out.println("Số lượng: " + quantity);
        System.out.printf("Tổng giá trị kho: %.2f%n", totalValue);
        System.out.println("Kho lớn (>100 sách): " + isLargeStock);
        System.out.println("Trạng thái: " + status);
        System.out.println("Có thể mượn: " + canBorrow);

        scanner.close();
    }
}
