import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ: ");
        int n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn: ");
        int m = sc.nextInt();

        double baseFine = n * m * 5000;
        double finalFine = baseFine;

        if (n > 7 && m >= 3) {
            finalFine = baseFine * 1.2;
        }

        boolean lockCard = finalFine > 50000;

        System.out.println("Tiền phạt gốc: " + baseFine + " VND");
        System.out.println("Tiền phạt sau điều chỉnh: " + finalFine + " VND");
        System.out.println("Yêu cầu khóa thẻ: " + lockCard);
    }
}
