import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static PetManager petManager = new PetManager();
    static CustomerManager customerManager = new CustomerManager();
    static SpaService spaService = new SpaService();
    static ActivityLog log = new ActivityLog();
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n==== QUẢN LÝ CỬA HÀNG THÚ CƯNG ====");
            System.out.println("1. Thêm thú cưng");
            System.out.println("2. Hiển thị danh sách thú cưng");
            System.out.println("3. Tìm thú cưng");
            System.out.println("4. Xóa thú cưng");
            System.out.println("5. Đăng ký khách hàng");
            System.out.println("6. Tìm khách hàng");
            System.out.println("7. Tiếp nhận thú cưng vào Spa");
            System.out.println("8. Phục vụ Spa");
            System.out.println("9. Hoàn tác thao tác gần nhất");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập mã thú cưng: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên thú cưng: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập loài: ");
                    String species = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = Double.parseDouble(sc.nextLine());
                    Pet pet = new Pet(id, name, species, price);
                    petManager.add(pet);
                    log.record("Đã thêm thú cưng " + id);
                    break;
                case 2:
                    for (Pet p : petManager.getAll()) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã thú cưng cần tìm: ");
                    Pet found = petManager.findById(sc.nextLine());
                    System.out.println(found != null ? found : "Không tìm thấy");
                    break;
                case 4:
                    System.out.print("Nhập mã thú cưng cần xóa: ");
                    String removeId = sc.nextLine();
                    if (petManager.removeById(removeId)) {
                        log.record("Đã xóa thú cưng " + removeId);
                        System.out.println("Xóa thành công.");
                    } else {
                        System.out.println("Không tìm thấy.");
                    }
                    break;
                case 5:
                    System.out.print("Nhập mã khách hàng: ");
                    String cid = sc.nextLine();
                    System.out.print("Nhập tên khách hàng: ");
                    String cname = sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phone = sc.nextLine();
                    if (customerManager.register(new Customer(cid, cname, phone))) {
                        log.record("Đã đăng ký khách hàng " + cid);
                        System.out.println("Đăng ký thành công.");
                    } else {
                        System.out.println("Trùng mã hoặc số điện thoại!");
                    }
                    break;
                case 6:
                    System.out.print("Nhập mã khách hàng cần tìm: ");
                    Customer c = customerManager.findById(sc.nextLine());
                    System.out.println(c != null ? c : "Không tìm thấy");
                    break;
                case 7:
                    System.out.print("Nhập mã thú cưng cần làm Spa: ");
                    Pet spaPet = petManager.findById(sc.nextLine());
                    if (spaPet != null) {
                        spaService.checkIn(spaPet);
                        log.record("Thú cưng " + spaPet.getId() + " đã vào hàng đợi Spa");
                        System.out.println("Đã thêm vào hàng đợi.");
                    } else {
                        System.out.println("Không tìm thấy thú cưng.");
                    }
                    break;
                case 8:
                    Pet serving = spaService.serveNext();
                    if (serving != null) {
                        log.record("Đã phục vụ Spa cho " + serving.getId());
                        System.out.println("Đang phục vụ: " + serving);
                    } else {
                        System.out.println("Không có thú cưng nào đang chờ.");
                    }
                    break;
                case 9:
                    log.undo();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
            }
        }
    }
}