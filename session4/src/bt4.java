import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class bt4 {
    public static void main(String[] args) {
        String cardID = "TV202312345";

        if (!cardID.matches("^[A-Z]{2}.*")) {
            System.out.println("Thiếu hoặc sai tiền tố chữ cái in hoa");
            return;
        }

        if (!cardID.matches("^[A-Z]{2}\\d{4}.*")) {
            System.out.println("Năm không hợp lệ");
            return;
        }

        Pattern pattern = Pattern.compile("^[A-Z]{2}\\d{4}\\d{5}$");
        Matcher matcher = pattern.matcher(cardID);

        if (matcher.matches()) {
            System.out.println("Mã thẻ hợp lệ!");
        } else {
            System.out.println("Phần số ngẫu nhiên không hợp lệ");
        }
    }
}
