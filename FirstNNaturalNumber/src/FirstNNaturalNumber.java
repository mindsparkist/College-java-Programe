import java.util.Scanner;

public class FirstNNaturalNumber {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Give N Natural Number");
        int N = UserInput.nextInt();
        for (int i = 0; i <= N; i++) {
            System.out.println(i);
        }

    }
}
