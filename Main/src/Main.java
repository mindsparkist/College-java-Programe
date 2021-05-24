//public class Main {
//    // This Is A Single Line Coment
//
//    public static void main(String[] args){
//       final int name ;
//        name = 15;
//        byte myNum = 20;
//        float myFloat = 9.55f;
//        char myChar = 'S';
//        boolean mybool = true;
//        String myText = "Dip";
//        System.out.println(myNum);
//    }
//
//}
/*      byte	1 byte	Stores whole numbers from -128 to 127
        short	2 bytes	Stores whole numbers from -32,768 to 32,767
        int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits (3.4e−038 to 3.4e+038)
        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits ( 1.7e−308 to 1.7e+308)
        boolean	1 bit	Stores true or false values
        char	2 bytes	Stores a single character/letter or ASCII values
 */
//public class Main{
//    public static void main(String[] args){
//
//        double myDouble = 9.0;
//        int myInt = (int) myDouble;
//
//        System.out.println("Double value Is " + myDouble);
//        System.out.println("Int Value Is " + myInt);
//    }
//}

//import java.util.Locale;
//
//public class Main{
//    public static void main(String[] args){
//        String txt = "Please locate where 'locate' occurs!";
////        System.out.println("the length of the text is " + txt.length());
////        System.out.println(txt.toLowerCase());
////        System.out.println(txt.toUpperCase());
//        System.out.println(txt.indexOf("Please"));
//    }
//}

/*
public class Main{
    public static void main(String[] args){
        if(18==20){
            System.out.println("I Am Mad");
        }
        else if(18<20) {
            System.out.println("18 Is Less Than 20");

        }else{
            System.out.println("earth Is Flat");
        }
    }
}
 */
/*
public class Main {
    public static void main(String[] args){
        // Switch Case
        int Day = 0;
        int day = Day;
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("thrusday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }
}

 */
/*
public class Main {
    public static void main(String[] args){
        String arr[] = {"Volvo", "BMW", "Ford", "Mazda"};
        int i;
        for (i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
 */

// 2D Array
/*
public class Main {
    public static void main(String[] args){
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i){
            for (int j = 0; j < myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
*/

//public class Main{
//    static void myMethod(){
//        System.out.println("I Got Exeucated");
//
//    }
//    public static void main(String[] args){
//        myMethod();
//        myMethod();
//        myMethod();
//    }
//}

/*
public class Main {
    static void myMethod(String fname){
        System.out.println("My Name Is " + fname);
    }


    public static void main(String[] args){
     myMethod("Shuvradip");
     myMethod("Ritam");
     myMethod("Ramen");
    }
}
*/

// This Keyword
/*
public class Main {
    String modelName;
    int year;

    public Main(String modelName,int year){
       this.modelName = modelName;
       this.year = year;
    }

    public Main(){
        this.modelName = "Nothing";
        this.year = 0000;
    }


    public static void main(String[] args){
       Main myObj = new Main("Bmw",2021);
       Main myobj2 = new Main();
        System.out.println("Model Number Is " + myObj.modelName + " And year Is " + myObj.year);
        System.out.println("Model Number Is " + myobj2.modelName + "And year Is " + myobj2.year);
    }
}
*/

//public class Main {
//    // Static method
//    static void myStaticMethod() {
//        System.out.println("Static methods can be called without creating objects");
//    }
//
//    // Public method
//    public void myPublicMethod() {
//        System.out.println("Public methods must be called by creating objects");
//    }
//
//    // Main method
//    public static void main(String[ ] args) {
//        myStaticMethod(); // Call the static method
//        // myPublicMethod(); This would output an error
//
//        Main myObj = new Main(); // Create an object of Main
//        myObj.myPublicMethod(); // Call the public method
//    }
//}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Why System.in
        System.out.println("Enter Name Age And Salary");

        String name = myObj.nextLine();
        int age = myObj.nextInt();
        float Salary = myObj.nextFloat();

        System.out.println("Name Is :" + name + " Age Is :" + age + " Salary Is :" + Salary);
    }
}

 */

/*

// Stack implementation in Java

class Stack {
  private int arr[];
  private int top;
  private int capacity;

  // Creating a stack
  Stack(int size) {
    arr = new int[size];
    capacity = size;
    top = -1;
  }

  // Add elements into stack
  public void push(int x) {
    if (isFull()) {
      System.out.println("OverFlow\nProgram Terminated\n");
      System.exit(1);
    }

    System.out.println("Inserting " + x);
    arr[++top] = x;
  }

  // Remove element from stack
  public int pop() {
    if (isEmpty()) {
      System.out.println("STACK EMPTY");
      System.exit(1);
    }
    return arr[top--];
  }

  // Utility function to return the size of the stack
  public int size() {
    return top + 1;
  }

  // Check if the stack is empty
  public Boolean isEmpty() {
    return top == -1;
  }

  // Check if the stack is full
  public Boolean isFull() {
    return top == capacity - 1;
  }

  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    Stack stack = new Stack(5);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    stack.pop();
    System.out.println("\nAfter popping out");

    stack.printStack();

  }
}
----------------------------------------------------------------
Queue
// Queue implementation in Java

public class Queue {
  int SIZE = 5;
  int items[] = new int[SIZE];
  int front, rear;

  Queue() {
    front = -1;
    rear = -1;
  }

  boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    return false;
  }

  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } else {
      if (front == -1)
        front = 0;
      rear++;
      items[rear] = element;
      System.out.println("Inserted " + element);
    }
  }

  int deQueue() {
    int element;
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    } else {
      element = items[front];
      if (front >= rear) {
        front = -1;
        rear = -1;
      }
      else {
              front++;
              }
              System.out.println("Deleted -> " + element);
              return (element);
              }
              }

              void display() {

              int i;
              if (isEmpty()) {
              System.out.println("Empty Queue");
              } else {
              System.out.println("\nFront index-> " + front);
              System.out.println("Items -> ");
              for (i = front; i <= rear; i++)
              System.out.print(items[i] + "  ");

              System.out.println("\nRear index-> " + rear);
              }
              }

public static void main(String[] args) {
        Queue q = new Queue();

        // deQueue is not possible on empty queue
        q.deQueue();

        // enQueue 5 elements
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        // 6th element can't be added to because the queue is full
        q.enQueue(6);

        q.display();

        // deQueue removes element entered first i.e. 1
        q.deQueue();

        // Now we have just 4 elements
        q.display();

        }
        }
 */
/*
// Linked list implementation in Java

class LinkedList {
  // Creating a node
  Node head;

  static class Node {
    int value;
    Node next;

    Node(int d) {
      value = d;
      next = null;
    }
  }

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();

    // Assign value values
    linkedList.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    // Connect nodess
    linkedList.head.next = second;
    second.next = third;

    // printing node-value
    while (linkedList.head != null) {
      System.out.print(linkedList.head.value + " ");
      linkedList.head = linkedList.head.next;
    }
  }
}
 */


