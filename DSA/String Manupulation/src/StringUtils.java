public class StringUtils {
    public static String reverse(String str) {
        StringBuilder reversedString = new StringBuilder();
        for (var i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }
}
