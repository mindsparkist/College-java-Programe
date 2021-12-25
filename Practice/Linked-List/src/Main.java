import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Linkedlist newLinkedlist = new Linkedlist();
      //  newLinkedlist.getSize();
        newLinkedlist.addLast(10);
        newLinkedlist.addLast(20);
        newLinkedlist.addLast(30);
        newLinkedlist.addLast(40);
        newLinkedlist.addLast(50);
       // newLinkedlist.getSize();
       // System.out.println(newLinkedlist.indexOf(0));
       // System.out.println(newLinkedlist.contains(10));
      //  newLinkedlist.removeLast();
       // newLinkedlist.removeFirst();
        newLinkedlist.getSize();
        var array = newLinkedlist.getArray();
        System.out.println(Arrays.toString(array));
//        write a method to reverse a linked list;
//        {10->20->30->40 }
//        find the kth node
    }
}
