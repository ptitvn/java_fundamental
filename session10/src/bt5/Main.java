public class Main {
    public static void main(String[] args) {

        Employee staff = new OfficeStaff("Nguyen Van A", 8000);
        Employee manager = new Manager("Tran Thi B", 12000, 3000);

        System.out.println("=== BẢNG LƯƠNG ===");
        staff.printSalary();
        System.out.println("------------------");
        manager.printSalary();
    }
}
