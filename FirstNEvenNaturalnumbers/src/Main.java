import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter A number");
        int N = UserInput.nextInt();
        int i = 1;
        while (i <= N) {
            System.out.println(" " + 2 * i);
            i++;
        }
    }
}
