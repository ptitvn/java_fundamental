import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class bt3 {
    public static void main(String[] args) {
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String today = LocalDate.now().format(formatter);

        long startSB = System.nanoTime();

        StringBuilder reportSB = new StringBuilder();
        reportSB.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        reportSB.append("Ngày tạo: ").append(today).append("\n");

        for (String t : transactions) {
            reportSB.append("Giao dịch: ").append(t).append("\n");
        }

        long endSB = System.nanoTime();

        long startStr = System.nanoTime();

        String reportStr = "";
        reportStr += "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportStr += "Ngày tạo: " + today + "\n";

        for (String t : transactions) {
            reportStr += "Giao dịch: " + t + "\n";
        }

        long endStr = System.nanoTime();

        System.out.println(reportSB.toString());
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + (endSB - startSB));
        System.out.println("Số thời gian thực thi đối với String: " + (endStr - startStr));
    }
}
