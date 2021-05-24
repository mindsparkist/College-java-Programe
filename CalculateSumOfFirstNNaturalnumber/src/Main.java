import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        int Sum = 0;
        System.out.println("Enter Number");
        int N = UserInput.nextInt();
        for (int i = 1; i <= N; i++) {
            Sum = Sum + i;
            // System.out.println(Sum);

        }
        System.out.println(Sum);
    }
}
