import java.util.Scanner;

import java.util.*;

public class Rectangle {
    public static void main(String[] args) {
        int h, w;
        System.out.println("Enter The Height And Width Of The Rectangle");
        Scanner userinpt = new Scanner(System.in);
        h = userinpt.nextInt();
        w = userinpt.nextInt();
        System.out.println("The Area Of The Rectangle Is " + h * w);
    }
}
