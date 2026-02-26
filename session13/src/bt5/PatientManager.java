package bt5;

import java.util.*;

public class PatientManager {

    private List<Patient> patientList = new ArrayList<>();

    // Thêm bệnh nhân (không trùng ID)
    public void addPatient(Patient patient) {
        if (findById(patient.getId()) != null) {
            System.out.println("ID đã tồn tại! Không thể thêm.");
            return;
        }
        patientList.add(patient);
        System.out.println("Bệnh nhân đã được thêm thành công.");
    }

    // Cập nhật chẩn đoán
    public void updateDiagnosis(String id, String newDiagnosis) {
        Patient p = findById(id);
        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
        } else {
            p.setDiagnosis(newDiagnosis);
            System.out.println("Chẩn đoán đã được cập nhật.");
        }
    }

    // Xuất viện
    public void dischargePatient(String id) {
        Patient p = findById(id);
        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân với ID đã cho.");
        } else {
            patientList.remove(p);
            System.out.println("Bệnh nhân đã được xuất viện.");
        }
    }

    // Sắp xếp theo yêu cầu
    public void sortPatients() {
        patientList.sort(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                // Tuổi giảm dần
                if (p2.getAge() != p1.getAge()) {
                    return p2.getAge() - p1.getAge();
                }
                // Nếu bằng tuổi -> tên A-Z
                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });
        System.out.println("Danh sách bệnh nhân đã được sắp xếp.");
    }

    // Hiển thị
    public void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        System.out.println("===========Danh sách bệnh nhân===========");
        for (Patient p : patientList) {
            System.out.println(p);
        }
    }

    // Tìm theo ID
    private Patient findById(String id) {
        for (Patient p : patientList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}