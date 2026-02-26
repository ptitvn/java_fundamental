import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class bt1 {

    public static void main(String[] args) {

        // Khởi tạo danh sách ban đầu
        ArrayList<Double> temperatures = new ArrayList<>(
                Arrays.asList(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8)
        );

        System.out.println("Danh sách ban đầu: " + temperatures);

        // Dùng Iterator để lọc
        Iterator<Double> iterator = temperatures.iterator();

        while (iterator.hasNext()) {
            Double temp = iterator.next();

            // Điều kiện hợp lệ: 34.0 → 42.0
            if (temp < 34.0 || temp > 42.0) {
                iterator.remove();  // Xóa an toàn
            }
        }

        System.out.println("Danh sách sau khi lọc: " + temperatures);

        // Tính trung bình
        double sum = 0;
        for (Double temp : temperatures) {
            sum += temp;
        }

        double average = sum / temperatures.size();

        System.out.printf("Nhiệt độ trung bình: %.2f\n", average);
    }
}