package session1;

import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = sc.nextInt();

        int booksPerShelf = 25;

        int shelfNumber = (stt - 1) / booksPerShelf + 1;

        int positionOnShelf = (stt - 1) % booksPerShelf + 1;

        String area = (shelfNumber <= 10)
                ? "Khu Cận (Gần cửa)"
                : "Khu Viễn (Xa cửa)";

        System.out.println("\n--- THÔNG TIN ĐỊNH VỊ ---");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: Kệ " + shelfNumber + " - Vị trí " + positionOnShelf);
        System.out.println("Phân khu: " + area);
    }
}
