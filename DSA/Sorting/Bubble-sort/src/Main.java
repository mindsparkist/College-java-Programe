import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7,8,9,3,5};
        var sorted = new BubbleSort();
        sorted.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
