import java.util.*;

public class mini_project_ss5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    twoSum();
                    break;
                case 2:
                    moveZeroes();
                    break;
                case 3:
                    validPalindrome();
                    break;
                case 4:
                    reverseWords();
                    break;
                case 5:
                    happyNumber();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);
    }

    // ================= MENU =================
    static void showMenu() {
        System.out.println("\n===== JAVA ALGORITHM CONSOLE =====");
        System.out.println("1. Two Sum");
        System.out.println("2. Move Zeroes");
        System.out.println("3. Valid Palindrome");
        System.out.println("4. Reverse Words");
        System.out.println("5. Happy Number");
        System.out.println("0. Thoat");
        System.out.print("Chon chuc nang: ");
    }

    // ================= FR1: TWO SUM =================
    static void twoSum() {
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhap target: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Tim thay tai vi tri: " + i + " va " + j);
                    found = true;
                    return;
                }
            }
        }

        if (!found) {
            System.out.println("Khong tim thay cap phu hop.");
        }
    }

    // ================= FR2: MOVE ZEROES =================
    static void moveZeroes() {
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < n) {
            arr[index++] = 0;
        }

        System.out.println("Mang sau khi xu ly:");
        System.out.println(Arrays.toString(arr));
    }

    // ================= FR3: VALID PALINDROME =================
    static void validPalindrome() {
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0, right = s.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Chuoi la Palindrome.");
        } else {
            System.out.println("Chuoi khong phai Palindrome.");
        }
    }

    // ================= FR4: REVERSE WORDS =================
    static void reverseWords() {
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        System.out.println("Ket qua:");
        System.out.println(result.toString().trim());
    }

    // ================= FR5: HAPPY NUMBER =================
    static void happyNumber() {
        System.out.print("Nhap so n: ");
        int n = sc.nextInt();

        int temp = n;
        while (temp != 1 && temp != 4) {
            int sum = 0;
            while (temp > 0) {
                int d = temp % 10;
                sum += d * d;
                temp /= 10;
            }
            temp = sum;
        }

        if (temp == 1) {
            System.out.println(n + " la Happy Number.");
        } else {
            System.out.println(n + " khong la Happy Number.");
        }
    }

   
}