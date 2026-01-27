
import java.util.Scanner;

public class btttg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] ids = new int[100];
        String[] titles = new String[100];
        int[] quantities = new int[100];
        int current = 2;
        ids[0] = 1;
        titles[0] = "Lão hạc";
        quantities[0] = 10;
        ids[1] = 2;
        titles[1] = "chiếc lược ngà";
        quantities[1] = 9;
        do { 
            System.out.println("""
                1.xem danh sách 
                2. thêm
                3. cập nhật
                4. xóa
                5. tìm kiếm
                    
                    """);

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 :
                    for (int i = 0; i < current; i++) {
                        System.out.printf("id: %d, title: %s, quantity: %d\n", ids[i], titles[i], quantities[i]);
                    }
                    break;
                case 2 :
                    
                
                
                    break;
                case 3 : break;
                case 4 : break;
                default:
                    throw new AssertionError();
            }

        } while (true);
    }
}
