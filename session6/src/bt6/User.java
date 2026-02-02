package bt6;
public class User {

    private int id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            System.out.println("Password không được rỗng");
        } else {
            this.password = password;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ");
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        User u1 = new User(1, "donglt", "123456", "dong@gmail.com");
        u1.displayInfo();

        User u2 = new User(2, "user2", "", "user2@gmail.com");
        u2.displayInfo();

        User u3 = new User(3, "user3", "abc123", "sai-email");
        u3.displayInfo();
    }
}
