package bt4;
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("NV01", "Nguyễn Văn A");

        Employee e3 = new Employee("NV02", "Trần Thị B", 15_000_000);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }

    public static class Employee {

        String empId;
        String name;
        double salary;

        public Employee() {
            empId = "Unknown";
            name = "No Name";
            salary = 0;
        }

        public Employee(String empId, String name) {
            this.empId = empId;
            this.name = name;
            this.salary = 0;
        }

        public Employee(String empId, String name, double salary) {
            this.empId = empId;
            this.name = name;
            this.salary = salary;
        }

        public void displayInfo() {
            System.out.println("Mã NV: " + empId);
            System.out.println("Tên NV: " + name);
            System.out.println("Lương: " + salary);
            System.out.println("---------------------------");
        }
    }
}
