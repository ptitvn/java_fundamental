package session1;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double priceUSD = sc.nextDouble();

        System.out.print("Nhập tỷ giá (VNĐ/USD - kiểu float): ");
        float exchangeRate = sc.nextFloat();

        double priceVND = priceUSD * exchangeRate;

        long roundedPrice = (long) priceVND;

        System.out.println("Giá chính xác (số thực): " + priceVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedPrice);
    }
}
