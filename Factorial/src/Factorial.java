import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Number");
        int sc = UserInput.nextInt();
        int Factorial = 1;
        while (sc != 0) {
            Factorial = Factorial * sc;
            sc--;

        }
        System.out.println(Factorial);
    }
}
