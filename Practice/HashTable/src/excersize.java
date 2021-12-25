import java.util.HashSet;

public class excersize {
    public char firstRepetedChar(String src) {
        if (src == null)
            throw new IllegalArgumentException();
        HashSet<Character> set = new HashSet<>();
        for (var item : src.toCharArray()) {
            if (set.contains(item)){
                return item;
            }
            set.add(item);
        }
        return 0;
    }
}
