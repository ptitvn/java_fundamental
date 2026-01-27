import java.util.Scanner;

public class bt5 {

    public static int deleteBook(int[] arr, int n, int bookId) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return n;
        }

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1;
    }

    public static void displayBooks(int[] arr, int n) {
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = 5;

        while (n > 0) {
            System.out.print("Kho sách hiện tại (" + n + " cuốn): ");
            displayBooks(books, n);

            System.out.print("Nhập mã sách cần xóa (0 để thoát): ");
            int bookId = scanner.nextInt();

            if (bookId == 0) {
                break;
            }

            int newN = deleteBook(books, n, bookId);

            if (newN < n) {
                n = newN;
                System.out.println("Đã xóa sách mã " + bookId);
            } else {
                System.out.println("Không tìm thấy sách mã " + bookId);
            }
        }
    }
}
