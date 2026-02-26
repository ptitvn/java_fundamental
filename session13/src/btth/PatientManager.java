package btth;

import java.util.ArrayList;
import java.util.List;

public class PatientManager {
    private List<Patient> patientList;

    public PatientManager() {
        patientList = new ArrayList<>();
    }

    // Create
    public void addPatient(Patient patient) {
        patientList.add(patient);
        System.out.println("Thêm bệnh nhân thành công!");
    }

    // Delete
    public void removePatient(int patientId) {
        Patient found = findById(patientId);
        if (found != null) {
            patientList.remove(found);
            System.out.println("Xóa bệnh nhân thành công!");
        } else {
            System.out.println("Không tìm thấy bệnh nhân!");
        }
    }

    // Update
    public void updatePatient(int patientId, Patient updatedPatient) {
        Patient existing = findById(patientId);
        if (existing != null) {
            existing.setName(updatedPatient.getName());
            existing.setAge(updatedPatient.getAge());
            existing.setGender(updatedPatient.getGender());
            existing.setDisease(updatedPatient.getDisease());
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Không tìm thấy bệnh nhân!");
        }
    }

    // Search by Name
    public void searchPatientByName(String name) {
        boolean found = false;
        for (Patient p : patientList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy bệnh nhân!");
        }
    }

    // Display
    public void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sách bệnh nhân trống!");
        } else {
            for (Patient p : patientList) {
                System.out.println(p);
            }
        }
    }

    // Helper method
    private Patient findById(int id) {
        for (Patient p : patientList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}