import java.util.Scanner;

public class FirstNOddNumbers {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter N Odd Number");
        int N = UserInput.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(2*i-1);
        }
    }
}
