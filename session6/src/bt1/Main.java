package bt1;

public class Main {
    public static void main(String[] args) {

        Student sv1 = new Student(
                "SV001",
                "Nguyễn Văn A",
                2004,
                8.5
        );

        Student sv2 = new Student(
                "SV002",
                "Trần Thị B",
                2003,
                7.8
        );

        sv1.displayInfo();
        sv2.displayInfo();
    }
}
