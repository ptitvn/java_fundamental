package bt4;

public class Main {
    public static void main(String[] args) {

        EmergencyQueue queue = new EmergencyQueue();

        queue.addPatient(new EmergencyPatient("E01", "Nguyễn A", 2));
        queue.addPatient(new EmergencyPatient("E02", "Trần B", 1));
        queue.addPatient(new EmergencyPatient("E03", "Lê C", 2));
        queue.addPatient(new EmergencyPatient("E04", "Phạm D", 1));

        System.out.println();
        queue.displayQueue();

        System.out.println();
        queue.callNextPatient();
        queue.callNextPatient();
        queue.callNextPatient();
        queue.callNextPatient();
    }
}