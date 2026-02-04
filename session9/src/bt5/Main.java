import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("An", 10000000));
        employees.add(new ProductionEmployee("Bình", 120, 50000));
        employees.add(new OfficeEmployee("Chi", 12000000));

        double tongLuong = 0;

        for (Employee e : employees) {
            tongLuong += e.calculateSalary(); // đa hình runtime
        }

        System.out.println("Tổng lương: " + tongLuong);
    }
}
