import java.util.Scanner;

public class btth {

    public static String chuanHoaTen(String input) {
        input = input.trim().toLowerCase();
        String[] words = input.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1))
              .append(" ");
        }
        return sb.toString().trim();
    }

    public static String taoTrichDan(String id, String title, String author, int year) {
        StringBuilder sb = new StringBuilder();
        sb.append(id)
          .append(" - ")
          .append(title)
          .append(" - ")
          .append(author)
          .append(" (")
          .append(year)
          .append(")");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookId;
        String isbn;
        int year;

        do {
            System.out.print("Nhập mã sách (LIB-xxxx-S): ");
            bookId = sc.nextLine();
        } while (!bookId.matches("^LIB-\\d{4}-S$"));

        do {
            System.out.print("Nhập ISBN-10 (10 chữ số): ");
            isbn = sc.nextLine();
        } while (!isbn.matches("^\\d{10}$"));

        do {
            System.out.print("Nhập năm xuất bản: ");
            year = Integer.parseInt(sc.nextLine());
        } while (year > 2026 || year < 1000);

        System.out.print("Nhập tên sách: ");
        String titleRaw = sc.nextLine();
        String title = chuanHoaTen(titleRaw);

        System.out.print("Nhập tên tác giả: ");
        String authorRaw = sc.nextLine();
        String author = chuanHoaTen(authorRaw);

        String citation = taoTrichDan(bookId, title, author, year);

        System.out.println("\n===== THÔNG TIN SÁCH =====");
        System.out.println("Book ID : " + bookId);
        System.out.println("ISBN    : " + isbn);
        System.out.println("Năm XB  : " + year);
        System.out.println("Tiêu đề : " + title);
        System.out.println("Tác giả : " + author);

        System.out.println("\nTem nhãn:");
        System.out.println(citation);
    }
}
