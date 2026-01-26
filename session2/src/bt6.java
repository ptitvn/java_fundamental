import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = Integer.MAX_VALUE;
        int tong = 0;
        int demNgayMo = 0;

        String[] ngay = {
                "Thu 2", "Thu 3", "Thu 4",
                "Thu 5", "Thu 6", "Thu 7", "Chu Nhat"
        };

        for (int i = 0; i < 7; i++) {
            System.out.print("Nhap luot muon ngay " + ngay[i] + ": ");
            int luotMuon = sc.nextInt();

            if (luotMuon == 0) {
                continue;
            }

            if (luotMuon > max) {
                max = luotMuon;
            }

            if (luotMuon < min) {
                min = luotMuon;
            }

            tong += luotMuon;
            demNgayMo++;
        }

        double trungBinh = (demNgayMo > 0) ? (double) tong / demNgayMo : 0;

        System.out.println();
        System.out.println("--- KET QUA THONG KE ---");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.println("Trung binh luot muon/ngay: " + trungBinh);
    }
}
