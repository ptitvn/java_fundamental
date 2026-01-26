
import java.util.Scanner;

public class btth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Chức năng 1: Tính tiền phạt System
        System.out.print("Nhập số lượng sách trả: ");
        int soSach = sc.nextInt();
        int tongTienPhat = 0;
        for (int i = 1; i <= soSach; i++) {
            System.out.print("Nhập số ngày quá hạn cho sách " + i + ": ");
            int days = sc.nextInt();
            if (days <= 5) {
                tongTienPhat += days * 2000;
            } else {
                tongTienPhat += (5 * 2000) + ((days - 5) * 5000);
            }
        }
        System.out.println("Tổng tiền phạt: " + tongTienPhat + " VNĐ");

        // Chức năng 2: Đăng ký VIP System
        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.print("Nhập số sách đã mượn trong tháng: ");
        int soSachMuon = sc.nextInt();
        System.out.print("Có thẻ ưu tiên sinh viên? (1: Có, 0: Không): ");
        int uuTien = sc.nextInt();
        boolean isVIP = (age >= 18 && soSachMuon >= 10) || (uuTien == 1);
        if (isVIP) {
            System.out.println("Đủ tiêu chuẩn nâng cấp VIP");
        } else {
            System.out.println("Chưa đủ tiêu chuẩn");
        }

// yêu cầu 3:
        int tongSachNhap = 0;
        int maSach;
        do {
            System.out.print("Nhập mã số sách (0 để dừng): ");
            maSach = sc.nextInt();
            if (maSach < 0) {
                System.out.println("Mã số không hợp lệ, nhập lại!");
                continue;
            }
            if (maSach == 0) {
                break;
            }
            tongSachNhap++;
        } while (true);
        System.out.println("Tổng số sách hợp lệ đã nhập: " + tongSachNhap);
    }
}
