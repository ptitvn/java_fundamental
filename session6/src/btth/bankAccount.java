public class BankAccount {

    // ===== Thuộc tính (Encapsulation) =====
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount() {
        this.accountNumber = "Unknown";
        this.ownerName = "No Name";
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // ===== Getter / Setter =====
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (!accountNumber.isEmpty()) {
            this.accountNumber = accountNumber;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (!ownerName.isEmpty()) {
            this.ownerName = ownerName;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    // ===== Nạp tiền =====
    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Nạp tiền thành công: " + money);
        } else {
            System.out.println("Số tiền nạp không hợp lệ!");
        }
    }

    // ===== Rút tiền =====
    public void withdraw(double money) {
        if (money <= 0) {
            System.out.println("Số tiền rút không hợp lệ!");
        } else if (balance < money) {
            System.out.println("Số dư không đủ!");
        } else {
            balance -= money;
            System.out.println("Rút tiền thành công: " + money);
        }
    }

    // ===== Hiển thị thông tin =====
    public void display() {
        System.out.println("-----------------------------------");
        System.out.println("Số TK: " + accountNumber);
        System.out.println("Name: " + ownerName);
        System.out.println("Balance: " + balance + " VNĐ");
        System.out.println("-----------------------------------");
    }
}
