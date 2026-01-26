import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double priceUSD = sc.nextDouble();

        System.out.print("Nhập tỷ giá (VND - kiểu float): ");
        float exchangeRate = sc.nextFloat();

        double totalVND = priceUSD * exchangeRate;
        long roundedVND = (long) totalVND;

        System.out.println("Giá chính xác (số thực): " + totalVND);
        System.out.println("Giá làm tròn để thanh toán (long): " + roundedVND);
    }
}
