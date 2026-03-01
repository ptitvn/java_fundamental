import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class bt4 {
    public static void main(String[] args) {

        List<String> cases = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );

        // TreeMap để tự động sắp xếp theo tên bệnh
        Map<String, Integer> statistics = new TreeMap<>();

        for (String disease : cases) {
            if (statistics.containsKey(disease)) {
                statistics.put(disease, statistics.get(disease) + 1);
            } else {
                statistics.put(disease, 1);
            }
        }

        // In báo cáo
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            System.out.println(entry.getKey() + ": "
                    + entry.getValue() + " ca");
        }
    }
}