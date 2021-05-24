import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter A Number");
        int N = UserInput.nextInt();
        N = N - 1;
        for (int I = 0; N > I; N--) {
            System.out.println(" " + N);
        }
    }
}
