package bt5;

public class Main {

    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        // Tạo bệnh nhân
        Patient p1 = new Patient("P01", "Nguyễn A", 35);
        Patient p2 = new Patient("P02", "Trần B", 28);

        // Tạo ca cấp cứu
        EmergencyCase case1 = new EmergencyCase(p1);
        EmergencyCase case2 = new EmergencyCase(p2);

        // Thêm vào queue
        queue.addCase(case1);
        queue.addCase(case2);

        System.out.println();

        // Xử lý ca đầu tiên
        EmergencyCase currentCase = queue.getNextCase();

        currentCase.addStep(new TreatmentStep("Tiếp nhận", "08:00"));
        currentCase.addStep(new TreatmentStep("Chẩn đoán", "08:05"));
        currentCase.addStep(new TreatmentStep("Điều trị", "08:15"));

        currentCase.displaySteps();

        System.out.println();
        currentCase.undoStep();
        currentCase.displaySteps();
    }
}