package bt4;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<EmergencyPatient> emergencyQueue; // cấp cứu
    private Queue<EmergencyPatient> normalQueue;    // thường

    public EmergencyQueue() {
        emergencyQueue = new LinkedList<>();
        normalQueue = new LinkedList<>();
    }

    public void addPatient(EmergencyPatient p) {

        if (p.getPriority() == 1) {
            emergencyQueue.add(p);
        } else {
            normalQueue.add(p);
        }

        System.out.println("Đã thêm: " + p);
    }

    public EmergencyPatient callNextPatient() {

        EmergencyPatient next;

        if (!emergencyQueue.isEmpty()) {
            next = emergencyQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            next = normalQueue.poll();
        } else {
            System.out.println("Không còn bệnh nhân.");
            return null;
        }

        System.out.println("Đang khám: " + next);
        return next;
    }

    public void displayQueue() {

        System.out.println("=== Bệnh nhân cấp cứu ===");
        for (EmergencyPatient p : emergencyQueue) {
            System.out.println(p);
        }

        System.out.println("=== Bệnh nhân thường ===");
        for (EmergencyPatient p : normalQueue) {
            System.out.println(p);
        }
    }
}