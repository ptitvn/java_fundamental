package session1;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        String bookID;
        String bookName;
        int publishYear;
        double price;
        boolean isAvailable;

        System.out.println("Nhập mã sách: ");
        bookID = sc.nextLine();

        System.out.println("Nhập tên sách: ");
        bookName = sc.nextLine();

        System.out.println("Nhập ngày xuất bản: ");
        publishYear = sc.nextInt();

        System.out.println("nhập giá bìa: ");
        price = sc.nextDouble();

        System.out.println("sách còn trong kho viết (true/false): ");
        isAvailable = sc.nextBoolean();

        int bookAge = 2026 - publishYear;
        String bookNameUpper = bookName.toUpperCase();
        String status = isAvailable ? "còn sách" : "hết sách";

        System.out.println("Tên sách: " + bookNameUpper);
        System.out.println("Mã số: " + bookID + " | Tuổi thọ: " + bookAge + " năm");
        System.out.printf("Giá bán: %.2f VND%n", price);
        System.out.println("Tình trạng: " + status);

    }
}