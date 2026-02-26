package btth;

import java.util.Scanner;

public class MainMenu {
    private static PatientManager manager = new PatientManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        System.out.println("\n===== QUẢN LÝ BỆNH NHÂN =====");
        System.out.println("1. Thêm bệnh nhân");
        System.out.println("2. Xóa bệnh nhân");
        System.out.println("3. Cập nhật bệnh nhân");
        System.out.println("4. Tìm kiếm bệnh nhân theo tên");
        System.out.println("5. Hiển thị danh sách bệnh nhân");
        System.out.println("0. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    public static void handleMenuSelection() {
        int choice;
        do {
            displayMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    deletePatient();
                    break;
                case 3:
                    updatePatient();
                    break;
                case 4:
                    searchPatient();
                    break;
                case 5:
                    manager.displayPatients();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    private static void addPatient() {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();

        System.out.print("Nhập bệnh lý: ");
        String disease = scanner.nextLine();

        Patient patient = new Patient(id, name, age, gender, disease);
        manager.addPatient(patient);
    }

    private static void deletePatient() {
        System.out.print("Nhập ID cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        manager.removePatient(id);
    }

    private static void updatePatient() {
        System.out.print("Nhập ID cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên mới: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi mới: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập giới tính mới: ");
        String gender = scanner.nextLine();

        System.out.print("Nhập bệnh lý mới: ");
        String disease = scanner.nextLine();

        Patient updated = new Patient(id, name, age, gender, disease);
        manager.updatePatient(id, updated);
    }

    private static void searchPatient() {
        System.out.print("Nhập tên cần tìm: ");
        String name = scanner.nextLine();
        manager.searchPatientByName(name);
    }

    public static void main(String[] args) {
        handleMenuSelection();
    }
}