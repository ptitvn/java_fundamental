
import java.util.Scanner;

public class bt1 {


   public static int[] addBookToLibraries(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] books = new int[n];

        System.out.println("Nhập mã số cho " + n + " cuốn sách:");
        for (int i = 0; i < n; i++) {
            System.out.print("Sách thứ " + (i + 1) + ": ");
            books[i] = scanner.nextInt();
        }

        return books;
    }

    public static void displayLibraries(int[] arr) {
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.print("Danh sách mã sách: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sách cần quản lý: ");
        int n = scanner.nextInt();

        int[] bookList = addBookToLibraries(n);
        displayLibraries(bookList);
    }
    
}
