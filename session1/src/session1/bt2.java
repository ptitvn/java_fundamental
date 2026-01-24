package session1;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ: \n ");
        int n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn \n");
        int m = sc.nextInt();

        double totalFire = n * m * 5000;
        double sum = totalFire;

        if (n > 7 && m >= 3){
            totalFire *= 1.2;
        }

        boolean lockCard = totalFire > 5000;

        System.out.println("\nTiền phạt gốc: " + sum + " VND");
        System.out.println("Tiền phạt sau điều chỉnh: " + totalFire + " VND");
        System.out.println("Yêu cầu khóa thẻ: " + lockCard);
    }
}
