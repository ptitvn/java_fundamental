import java.util.Scanner;
public class bt3 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        final int PHAT_MOI_NGAY = 5000; 
        int n;
        int total = 0; 

        System.out.print("Nhap so luong sach tra muon: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so ngay tre cua cuon thu " + i + ": ");
            int soNgayTre = sc.nextInt();

            int tienPhatCuon = soNgayTre * PHAT_MOI_NGAY;

            total += tienPhatCuon;
        }

        System.out.println("===> Tong tien phat: " + total + " VND");
      }
   }