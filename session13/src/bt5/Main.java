package bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PatientManager manager = new PatientManager();
        int choice;

        do {
            System.out.println("\n=============MENU=============");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách bệnh nhân");
            System.out.println("5. Hiển thị danh sách bệnh nhân");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();

                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập tuổi: ");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập chẩn đoán: ");
                    String diagnosis = sc.nextLine();

                    manager.addPatient(new Patient(id, name, age, diagnosis));
                    break;

                case 2:
                    System.out.print("Nhập ID bệnh nhân để cập nhật: ");
                    String updateId = sc.nextLine();

                    System.out.print("Nhập chẩn đoán mới: ");
                    String newDiagnosis = sc.nextLine();

                    manager.updateDiagnosis(updateId, newDiagnosis);
                    break;

                case 3:
                    System.out.print("Nhập ID bệnh nhân để xuất viện: ");
                    String dischargeId = sc.nextLine();
                    manager.dischargePatient(dischargeId);
                    break;

                case 4:
                    manager.sortPatients();
                    break;

                case 5:
                    manager.displayPatients();
                    break;

                case 6:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);

        sc.close();
    }
}