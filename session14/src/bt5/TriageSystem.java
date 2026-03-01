package bt5;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TriageSystem {

    public static void main(String[] args) {

        Comparator<Patient> triageComparator = (p1, p2) -> {

            if (p1.getSeverity() != p2.getSeverity())
                return p1.getSeverity() - p2.getSeverity();

            if (p1.getArrivalTime() != p2.getArrivalTime())
                return p1.getArrivalTime() - p2.getArrivalTime();

            return p1.getName().compareTo(p2.getName());
        };

        Set<Patient> queue = new TreeSet<>(triageComparator);

        queue.add(new Patient("Bệnh nhân A", 3, 800));
        queue.add(new Patient("Bệnh nhân B", 1, 815));
        queue.add(new Patient("Bệnh nhân C", 1, 805));

        System.out.println("=== Thứ tự xử lý cấp cứu ===");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
