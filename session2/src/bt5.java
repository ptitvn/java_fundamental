import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int code = sc.nextInt();

        int thousands = code / 1000;
        int hundreds = (code / 100) % 10;
        int dozens = (code / 10) % 10;
        int units = code % 10;

        int expectedCheckDigit = (thousands + hundreds + dozens) % 10;
        boolean isValid = expectedCheckDigit == units;

        System.out.println("Chữ số kiểm tra kỳ vọng: " + expectedCheckDigit);
        System.out.print("Kết quả kiểm tra mã sách: ");
        System.out.println(isValid ? "HỢP LỆ" : "SAI MÃ");
    }
}
