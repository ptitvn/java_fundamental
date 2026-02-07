package btth;

public class Main {
    public static void main(String[] args) {

        // Credit Card
        Payable creditCard = new CreditCard(
                "Nguyen Van A",
                "CC001",
                "1234567812345678",
                "123",
                5000
        );

        // E-Wallet
        Payable eWallet = new EWallet(
                "Tran Thi B",
                "EW001",
                "0987654321",
                2000
        );

        System.out.println("=== THANH TOÁN THẺ ===");
        creditCard.pay(1500);

        System.out.println("\n=== THANH TOÁN VÍ ===");
        eWallet.pay(500);

        // Anonymous Class – Reward Point
        Payable rewardPoint = new Payable() {
            @Override
            public void pay(double money) {
                if (money <= 0) {
                    System.err.println("Số tiền không hợp lệ");
                    return;
                }

                int points = (int) (money * 10);
                System.out.println("Thanh toán " + money +
                        " bằng điểm thưởng → nhận " + points + " điểm");
            }
        };

        System.out.println("\n=== THANH TOÁN ĐIỂM THƯỞNG ===");
        rewardPoint.pay(300);
    }
}
