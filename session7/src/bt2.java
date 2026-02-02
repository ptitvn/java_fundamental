public class bt2 {
    public static void main(String[] args) {

        int a = 10;
        int b = a;
        b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Reference
        Student s1 = new Student("An");
        Student s2 = s1;
        s2.name = "Bình";

        System.out.println("Tên s1: " + s1.name);
        System.out.println("Tên s2: " + s2.name);
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
