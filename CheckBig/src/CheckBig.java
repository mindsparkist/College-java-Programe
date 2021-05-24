import java.util.Scanner;

public class CheckBig {
    public static void main(String[] args) {
        int FirstNumber,SecondNumber;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter First Number");
         FirstNumber = Sc.nextInt();
        System.out.println("Enter Second Number");
        SecondNumber = Sc.nextInt();
        if (FirstNumber>SecondNumber) {
            System.out.println("FirstNumber Is Bigger");
        } else if (SecondNumber<FirstNumber) {
            System.out.println("SecondNumber Is Bigger");
        } else if (FirstNumber==SecondNumber) {
            System.out.println("Both Number Are The Same");
        }

        System.out.println("Working");
    }
}
