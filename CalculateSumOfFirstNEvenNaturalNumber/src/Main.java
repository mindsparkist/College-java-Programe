import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter Number");
        int N = UserInput.nextInt();
        int Sum = 0;
        for (int i = 1; i <= N; i++) {
            // 2*i
            Sum += (2 * i);
        }
        System.out.println(Sum);
    }
}
