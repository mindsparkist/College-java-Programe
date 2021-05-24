import java.util.Scanner;


public class Prime {

    public static void main(String[] args) {
        int inputNumber;
        boolean isPrime = true;
        System.out.println("Enter A Number");
        Scanner obj1 = new Scanner(System.in);
        inputNumber = obj1.nextInt();

        for (int i = 2; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not A Prime");
        }
    }


}
