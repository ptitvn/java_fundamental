package bt4;

import java.util.LinkedList;

public class EmergencyRoom {

    private LinkedList<String> queue;

    public EmergencyRoom() {
        queue = new LinkedList<>();
    }

    // Bệnh nhân thường -> cuối hàng
    public void patientCheckIn(String name) {
        queue.addLast(name);
        System.out.println(name + " đã check-in (thường).");
    }

    // Ca nguy kịch -> đầu hàng
    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
        System.out.println(name + " vào diện cấp cứu khẩn cấp!");
    }

    // Bác sĩ gọi bệnh nhân
    public void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân nào.");
            return;
        }

        String patient = queue.removeFirst();

        // Nếu bệnh nhân được đưa vào từ emergencyCheckIn
        // (Ở đây chỉ mô phỏng theo thứ tự, không lưu trạng thái)
        System.out.println("Đang xử lý: " + patient);
    }
}