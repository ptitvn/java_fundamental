import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.List;

public class bt1 {
    public static void main(String[] args) {

        List<String> input = Arrays.asList(
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        );

        // Dùng LinkedHashSet để:
        // 1. Loại bỏ trùng
        // 2. Giữ nguyên thứ tự thêm vào
        Set<String> waitingList = new LinkedHashSet<>(input);

        System.out.println("Danh sách gọi khám:");
        for (String patient : waitingList) {
            System.out.println(patient);
        }
    }
}