import java.util.*;

public class PrintWithLoop {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int arr[ i] =myObj.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}

