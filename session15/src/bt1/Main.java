package bt1;

public class Main {
    public static void main(String[] args) {

        MedicalRecordHistory recordHistory = new MedicalRecordHistory();

        // Thêm chỉnh sửa
        recordHistory.addEdit(new EditAction("Cập nhật chẩn đoán", "10:00"));
        recordHistory.addEdit(new EditAction("Thêm đơn thuốc", "10:15"));
        recordHistory.addEdit(new EditAction("Sửa liều thuốc", "10:30"));

        recordHistory.displayHistory();

        // Xem chỉnh sửa gần nhất
        System.out.println("\nChỉnh sửa gần nhất: " + recordHistory.getLatestEdit());

        // Undo
        recordHistory.undoEdit();
        recordHistory.displayHistory();

        recordHistory.undoEdit();
        recordHistory.displayHistory();
    }
}