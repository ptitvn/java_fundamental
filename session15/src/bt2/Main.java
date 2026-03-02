package bt2;

public class Main {
    public static void main(String[] args) {

        PatientQueue patientQueue = new PatientQueue();

        patientQueue.addPatient(new Patient("P01", "Nguyễn Văn A", 30));
        patientQueue.addPatient(new Patient("P02", "Trần Thị B", 25));
        patientQueue.addPatient(new Patient("P03", "Lê Văn C", 40));

        patientQueue.displayQueue();

        System.out.println("\nBệnh nhân tiếp theo: " + patientQueue.peekNextPatient());

        System.out.println();
        patientQueue.callNextPatient();
        patientQueue.displayQueue();

        System.out.println();
        patientQueue.callNextPatient();
        patientQueue.displayQueue();
    }
}