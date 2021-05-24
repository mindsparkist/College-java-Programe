import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Number");
        int N;
        N = UserInput.nextInt();
        for (int i =1;i<=N;i++){
            System.out.println((2*i-1));
        }
    }
}
