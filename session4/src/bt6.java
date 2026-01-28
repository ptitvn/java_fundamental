import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bt6 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";

        String[] blacklist = { "tệ", "ngu ngốc", "không đáng đọc" };

        String filtered = review;

        for (String word : blacklist) {
            String regex = "(?i)\\b" + Pattern.quote(word) + "\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(filtered);

            StringBuffer sb = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(sb, "*".repeat(matcher.group().length()));
            }
            matcher.appendTail(sb);
            filtered = sb.toString();
        }

        if (filtered.length() > 200) {
            int cut = filtered.lastIndexOf(" ", 200);
            if (cut == -1) cut = 200;

            StringBuilder builder = new StringBuilder();
            builder.append(filtered.substring(0, cut)).append("...");
            filtered = builder.toString();
        }

        System.out.println("Review sau khi xử lý: " + filtered);
    }
}
