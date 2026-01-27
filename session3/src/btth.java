import java.util.Scanner;

public class btth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ids = new int[100];
        String[] titles = new String[100];
        int[] quantities = new int[100];

        int current = 2;

        // Dữ liệu mẫu
        ids[0] = 1;
        titles[0] = "Lão Hạc";
        quantities[0] = 10;

        ids[1] = 2;
        titles[1] = "Chiếc Lược Ngà";
        quantities[1] = 9;

        int choice;
        do {
            System.out.println("""
                ===== QUẢN LÝ THƯ VIỆN =====
                1. Xem danh sách
                2. Thêm sách mới
                3. Cập nhật số lượng
                4. Xóa sách
                5. Tìm kiếm theo tên
                6. Sắp xếp theo số lượng (giảm dần)
                0. Thoát
                ==========================
                """);

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.println("Mã | Tên | Số lượng");
                    for (int i = 0; i < current; i++) {
                        System.out.printf("%d | %s | %d\n",
                                ids[i], titles[i], quantities[i]);
                    }
                }

                case 2 -> {
                    if (current >= ids.length) {
                        System.out.println("Kho sách đã đầy!");
                        break;
                    }

                    System.out.print("Nhập mã sách: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    boolean exists = false;
                    for (int i = 0; i < current; i++) {
                        if (ids[i] == id) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Mã sách đã tồn tại!");
                        break;
                    }

                    System.out.print("Nhập tên sách: ");
                    String title = scanner.nextLine();

                    System.out.print("Nhập số lượng: ");
                    int quantity = Integer.parseInt(scanner.nextLine());

                    ids[current] = id;
                    titles[current] = title;
                    quantities[current] = quantity;
                    current++;

                    System.out.println("Thêm sách thành công!");
                }

                case 3 -> {
                    System.out.print("Nhập mã sách cần cập nhật: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    int index = -1;
                    for (int i = 0; i < current; i++) {
                        if (ids[i] == id) {
                            index = i;
                            break;
                        }
                    }

                    if (index == -1) {
                        System.out.println("Không tìm thấy sách!");
                    } else {
                        System.out.print("Nhập số lượng mới: ");
                        quantities[index] = Integer.parseInt(scanner.nextLine());
                        System.out.println("Cập nhật thành công!");
                    }
                }

                case 4 -> {
                    System.out.print("Nhập mã sách cần xóa: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    int index = -1;
                    for (int i = 0; i < current; i++) {
                        if (ids[i] == id) {
                            index = i;
                            break;
                        }
                    }

                    if (index == -1) {
                        System.out.println("Không tìm thấy sách!");
                    } else {
                        for (int i = index; i < current - 1; i++) {
                            ids[i] = ids[i + 1];
                            titles[i] = titles[i + 1];
                            quantities[i] = quantities[i + 1];
                        }
                        current--;
                        System.out.println("Xóa sách thành công!");
                    }
                }

                case 5 -> {
                    System.out.print("Nhập từ khóa tìm kiếm: ");
                    String keyword = scanner.nextLine().toLowerCase();

                    boolean found = false;
                    for (int i = 0; i < current; i++) {
                        if (titles[i].toLowerCase().contains(keyword)) {
                            System.out.printf("%d | %s | %d\n",
                                    ids[i], titles[i], quantities[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy sách phù hợp!");
                    }
                }

                case 6 -> {
                    for (int i = 0; i < current - 1; i++) {
                        for (int j = i + 1; j < current; j++) {
                            if (quantities[i] < quantities[j]) {
                                int tempQ = quantities[i];
                                quantities[i] = quantities[j];
                                quantities[j] = tempQ;

                                int tempId = ids[i];
                                ids[i] = ids[j];
                                ids[j] = tempId;

                                String tempTitle = titles[i];
                                titles[i] = titles[j];
                                titles[j] = tempTitle;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp theo số lượng giảm dần!");
                }

                case 0 -> System.out.println("Thoát chương trình!");

                default -> System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }
}
