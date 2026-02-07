package btth;

public class EWallet extends PaymentMethod implements Payable {

    private String phoneNumber; // 10 chữ số
    private double balance;     // số dư

    public EWallet() {
    }

    public EWallet(String accountName, String paymentId,
                   String phoneNumber, double balance) {
        super(accountName, paymentId);
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    // Getter & Setter
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Kiểm tra thông tin ví
    @Override
    public void validate() {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            System.err.println("❌ Số điện thoại không hợp lệ");
            return;
        }

        if (balance < 0) {
            System.err.println("❌ Số dư không hợp lệ");
            return;
        }

        System.out.println("✔️ Ví điện tử hợp lệ");
    }

    // Thanh toán
    @Override
    public void pay(double money) {
        if (money <= 0) {
            System.err.println("❌ Số tiền không hợp lệ");
            return;
        }

        validate();

        if (money > balance) {
            System.err.println("❌ Không đủ số dư");
            return;
        }

        balance -= money;
        System.out.println("✔️ Thanh toán thành công bằng Ví điện tử");
        System.out.println("Số dư còn lại: " + balance);
    }
}
