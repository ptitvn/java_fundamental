import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {

        // Tạo HashMap lưu danh mục thuốc
        Map<String, String> drugMap = new HashMap<>();

        // Thêm sẵn 5 loại thuốc
        drugMap.put("T01", "Paracetamol");
        drugMap.put("T02", "Ibuprofen");
        drugMap.put("T03", "Amoxicillin");
        drugMap.put("T04", "Vitamin C");
        drugMap.put("T05", "Aspirin");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã thuốc: ");
        String code = sc.nextLine();

        if (drugMap.containsKey(code)) {
            System.out.println("Tên thuốc: " + drugMap.get(code));
        } else {
            System.out.println("Thuốc không tồn tại.");
        }

        sc.close();
    }
}