import java.util.Scanner;


public class Palindrom {
    public static void main(String[] args) {
        int inputNumber, temp, reverseNumber = 0, reminder;
        System.out.println("Enter A Number");
        Scanner obj1 = new Scanner(System.in);
        inputNumber = obj1.nextInt();
        temp = inputNumber;
        while (temp > 0) {
            reminder = temp % 10;
            reverseNumber = (reverseNumber * 10) + reminder;
            temp = temp / 10;
        }
        if (inputNumber == reverseNumber) {
            System.out.println("Its Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}
