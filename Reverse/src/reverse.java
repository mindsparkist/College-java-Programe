import java.util.Scanner;
class reverse{
    public static void main(String[] args){
        int Number,Reminder = 0, temp = 0;
        System.out.println("Enter A Number");
        Scanner obj1 = new Scanner(System.in);
        Number = obj1.nextInt();

        while (Number>0){
            Reminder=Number%10;
            System.out.print(Reminder);
            Number = Number/10;
        }
    }
}
