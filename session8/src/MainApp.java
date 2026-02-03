import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager(100);

        int choice;
        do {
            System.out.println("""
                ===== QUẢN LÝ SINH VIÊN =====
                1. Thêm sinh viên
                2. Hiển thị danh sách
                3. Tìm sinh viên theo mã
                4. Xóa sinh viên
                5. Sắp xếp theo điểm
                6. Thống kê
                0. Thoát
            """);
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Mã SV: ");
                    String ma = sc.nextLine();
                    System.out.print("Họ tên: ");
                    String ten = sc.nextLine();
                    System.out.print("Tuổi: ");
                    int tuoi = Integer.parseInt(sc.nextLine());
                    System.out.print("Giới tính: ");
                    String gt = sc.nextLine();
                    System.out.print("Điểm Toán: ");
                    double toan = Double.parseDouble(sc.nextLine());
                    System.out.print("Điểm Lý: ");
                    double ly = Double.parseDouble(sc.nextLine());
                    System.out.print("Điểm Hóa: ");
                    double hoa = Double.parseDouble(sc.nextLine());

                    Student s = new Student(ma, ten, tuoi, gt, toan, ly, hoa);
                    if (manager.themSinhVien(s))
                        System.out.println("Thêm thành công!");
                    else
                        System.out.println("Thêm thất bại!");
                    break;

                case 2:
                    manager.hienThiDanhSach();
                    break;

                case 3:
                    System.out.print("Nhập mã SV: ");
                    Student found = manager.timTheoMa(sc.nextLine());
                    if (found != null) found.hienThi();
                    else System.out.println("Không tìm thấy!");
                    break;

                case 4:
                    System.out.print("Nhập mã SV cần xóa: ");
                    if (manager.xoaSinhVien(sc.nextLine()))
                        System.out.println("Đã xóa!");
                    else
                        System.out.println("Không tìm thấy!");
                    break;

                case 5:
                    manager.sapXepTheoDiem();
                    System.out.println("Đã sắp xếp!");
                    break;

                case 6:
                    manager.thongKe();
                    break;
            }
        } while (choice != 0);
    }
}
