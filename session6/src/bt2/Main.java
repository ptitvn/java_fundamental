package bt2;
public class Main {
    public static void main(String[] args) {

        Account acc = new Account(
                "NguyenvanA",
                "123456",
                "NguyenvanA@gmail.com"
        );

        acc.displayInfo();

        acc.changePassword("newpass123");

        acc.displayInfo();
    }
}
