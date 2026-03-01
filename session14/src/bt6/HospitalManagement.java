package bt6;

import java.util.*;

public class HospitalManagement {

    public static void main(String[] args) {

        // Danh sách ban đầu
        List<Patient> patients = Arrays.asList(
                new Patient("Lan", 45, "Tim mạch"),
                new Patient("Hùng", 50, "Nội tiết"),
                new Patient("Mai", 30, "Tim mạch")
        );

        // Map gom nhóm theo khoa
        Map<String, List<Patient>> departmentMap = new HashMap<>();

        // ===== Gom nhóm =====
        for (Patient p : patients) {

            String dept = p.getDepartment();

            if (!departmentMap.containsKey(dept)) {
                departmentMap.put(dept, new ArrayList<>());
            }

            departmentMap.get(dept).add(p);
        }

        // ===== In cấu trúc Map =====
        System.out.println("=== Danh sách theo Khoa ===");
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + " -> " + entry.getValue());
        }

        // ===== Tìm khoa đông nhất =====
        String maxDept = "";
        int maxCount = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            int size = entry.getValue().size();
            if (size > maxCount) {
                maxCount = size;
                maxDept = entry.getKey();
            }
        }

        System.out.println("\nKhoa " + maxDept +
                " đang đông nhất (" + maxCount + " bệnh nhân).");
    }
}