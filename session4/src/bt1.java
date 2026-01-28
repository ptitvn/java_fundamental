import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        String author = sc.nextLine();

        title = title.trim().replaceAll("\\s+", " ").toUpperCase();
        author = author.trim().replaceAll("\\s+", " ");
        author = chuanHoaTen(author);

        System.out.println("[" + title + "] - Tác giả: " + author);

        sc.close();
    }

    public static String chuanHoaTen(String s) {
        String[] words = s.toLowerCase().split(" ");
        String result = "";

        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        return result.trim();
    }
}
