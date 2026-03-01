import java.util.HashSet;
import java.util.Set;

public class bt3 {
    public static void main(String[] args) {

        // Set A: Thành phần thuốc
        Set<String> drugIngredients = new HashSet<>();
        drugIngredients.add("Aspirin");
        drugIngredients.add("Caffeine");
        drugIngredients.add("Paracetamol");

        // Set B: Chất dị ứng
        Set<String> allergyList = new HashSet<>();
        allergyList.add("Penicillin");
        allergyList.add("Aspirin");

        // Tìm giao (cảnh báo dị ứng)
        Set<String> warning = new HashSet<>(drugIngredients);
        warning.retainAll(allergyList);

        // Tìm hiệu (thành phần an toàn)
        Set<String> safeIngredients = new HashSet<>(drugIngredients);
        safeIngredients.removeAll(allergyList);

        System.out.println("Cảnh báo dị ứng: " + warning);
        System.out.println("Thành phần an toàn: " + safeIngredients);
    }
}