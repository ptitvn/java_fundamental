package bt2;
public class Account {

    String username;
    String password;
    String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        if (newPassword.length() >= 6) {
            password = newPassword;
            System.out.println("Đổi mật khẩu thành công!");
        } else {
            System.out.println("Mật khẩu phải có ít nhất 6 ký tự!");
        }
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("--------------------------");
    }
}
