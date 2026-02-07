package btth;

import java.util.Scanner;

public class CreditCard extends PaymentMethod implements Payable {

    private String cardNumber;   // 16 chữ số
    private String cvv;          // 3 chữ số
    private double creditLimit;  // hạn mức

    public CreditCard() {
    }

    public CreditCard(String accountName, String paymentId,
                      String cardNumber, String cvv, double creditLimit) {
        super(accountName, paymentId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }

    // Getter & Setter
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    // Kiểm tra thông tin thẻ
    @Override
    public void validate() {
        if (cardNumber == null || !cardNumber.matches("\\d{16}")) {
            System.err.println("❌ Số thẻ không hợp lệ (phải đủ 16 chữ số)");
            return;
        }

        if (cvv == null || !cvv.matches("\\d{3}")) {
            System.err.println("❌ CVV không hợp lệ (phải đủ 3 chữ số)");
            return;
        }

        if (creditLimit <= 0) {
            System.err.println("❌ Hạn mức không hợp lệ");
            return;
        }

        System.out.println("✔️ Thông tin thẻ tín dụng hợp lệ");
    }

    // Thanh toán
    @Override
    public void pay(double money) {
        if (money <= 0) {
            System.err.println("❌ Số tiền không hợp lệ");
            return;
        }

        validate();

        if (money > creditLimit) {
            System.err.println("❌ Vượt quá hạn mức tín dụng");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã CVV để xác nhận: ");
        String inputCVV = sc.nextLine();

        if (inputCVV.equals(cvv)) {
            creditLimit -= money;
            System.out.println("✔️ Thanh toán thành công bằng Thẻ tín dụng");
            System.out.println("Hạn mức còn lại: " + creditLimit);
        } else {
            System.err.println("❌ Sai mã CVV");
        }
    }
}
