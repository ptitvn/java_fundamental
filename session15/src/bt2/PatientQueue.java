package bt2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {

    private Queue<Patient> queue;

    public PatientQueue() {
        queue = new LinkedList<>();
    }

    // Thêm bệnh nhân (enqueue)
    public void addPatient(Patient p) {
        queue.add(p);
        System.out.println("Đã thêm bệnh nhân: " + p);
    }

    // Gọi bệnh nhân tiếp theo (dequeue)
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân trong hàng đợi.");
            return null;
        }

        Patient p = queue.poll();
        System.out.println("Đang khám: " + p);
        return p;
    }

    // Xem bệnh nhân tiếp theo (peek)
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi đang trống.");
            return null;
        }

        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Hiển thị danh sách bệnh nhân còn chờ
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân nào đang chờ.");
            return;
        }

        System.out.println("=== DANH SÁCH BỆNH NHÂN ĐANG CHỜ ===");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}