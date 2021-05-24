import java.util.Scanner;

public class MatrixAdd {

    public static void main(String[] args) {
        int first[][] = new int[3][3];
        int second[][] = new int[3][3];
        int Sum[][] = new int[3][3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Values Of First 3*3 Matrix");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                     first[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter The Values Of Second 3*3 Matrix");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                second[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter The Values Of First 3*3 Matrix");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
               Sum[i][j]= first[i][j] + second[i][j];
            }
        }

        System.out.println("Sum Of Two Matrix");
        for (int i= 0; i<3;i++){
            for (int j= 0; j<3;j++){
                System.out.println(Sum[i][j] + " ");
            }
            System.out.println();
        }

    }

}
