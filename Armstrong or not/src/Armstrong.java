import java.util.Scanner;

public class Armstrong {
    static int cube(int x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        int initialInput, temp, sum = 0, reminder;
        System.out.println("Enter A Number");
        Scanner obj1 = new Scanner(System.in);
        initialInput = obj1.nextInt();

        temp = initialInput;
        while (initialInput > 0) {
            reminder = initialInput % 10;
            initialInput /= 10;
            sum += cube(reminder);  // Create a cube function

        }
        if (temp == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        //(temp == sum) ? "Its An Armstrong" : "Its Not An Armstrong" ;
    }
}
