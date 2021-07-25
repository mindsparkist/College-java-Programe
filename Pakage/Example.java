package pack1;
import java.util.Scanner;
import pack2.Student;
public class Example {
  public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in); 
    var studentobject1 = new Student();
	System.out.println("Enter name");
	String userName = myObj.nextLine(); 
	studentobject1.setName(userName); // ptev
	System.out.println("Enter Roll");
	int userRoll = myObj.nextInt();  
	studentobject1.setRoll(userRoll); // put the entered value
	
	System.out.println("Rol Number is " + studentobject1.getRollNo());
	System.out.println("Name Is " + studentobject1.getName());
  }
}