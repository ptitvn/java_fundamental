public abstract class Employee {
    protected String ten;

    public Employee(String ten) {
        this.ten = ten;
    }

    public abstract double calculateSalary();
}
