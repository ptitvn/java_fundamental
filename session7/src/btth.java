
public class btth {
    public static void main(String[] args) {

        Student s1 = new Student("1", "Hà Bích Ngọc");
        Student s2 = new Student("2", "Nguyễn Văn An");
        Student s3 = new Student("3", "Trần Thị Mai");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        Student.showTotalStudent();
    }
}

class Student {

    private String id;
    private String name;

    public static final String SCHOOL_NAME = "PTIT";
    private static int studentCount = 0;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        studentCount++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("-----------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("School Name: " + SCHOOL_NAME);
        System.out.println("-----------------------------------");
    }

    public static void showTotalStudent() {
        System.out.println("Tổng số sinh viên: " + studentCount);
    }
}
