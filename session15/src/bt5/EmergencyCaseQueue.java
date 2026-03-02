package bt5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {

    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        cases = new LinkedList<>();
    }

    public void addCase(EmergencyCase c) {
        cases.add(c);
        System.out.println("Đã tiếp nhận ca: " + c.getPatient());
    }

    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Không còn ca cấp cứu.");
            return null;
        }

        EmergencyCase next = cases.poll();
        System.out.println("Đang xử lý: " + next.getPatient());
        return next;
    }
}