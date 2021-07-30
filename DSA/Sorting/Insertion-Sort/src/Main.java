import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7,3,5,2,3,1,8,8};
        var sorter =new InsertionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
