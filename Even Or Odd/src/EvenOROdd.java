import java.util.Scanner;

public class EvenOROdd {
    public static void main(String[] args) {
        int UserInput;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter A Number To Check If It Is Even Or Odd");
        UserInput = Sc.nextInt();
        if (UserInput%2==0){
            System.out.println("Even ");
        } else {
            System.out.println("Odd");
        }

    }
}
