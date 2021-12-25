public class Linkedlist {
    private static class Node {
        int value;
        Node next;

        Node(int item) {
            this.value = item;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    public void addLast(int item) {
        Node newNode = new Node(item);
        if (head == null & tail == null) head = newNode;
        else tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void addFirst(int item) {
        var newNode = new Node(item);
        if (head == null & tail == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }

    }

    public int indexOf(int item) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        Node current = head;
        while (current != null) {
            if (current.value == item) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void removeLast() {
        Node Previous = head;
        while (Previous.next != tail) {
            Previous = Previous.next;
        }
        tail = Previous;
        Previous.next = null;
        size--;
    }

    public void removeFirst() {
//        find the first using the head pointer
        var temp = head;
        head = head.next;
        temp = null;
        size--;
    }
    public void getSize(){
        System.out.println(size);
    }
    public int[] getArray(){
        int index=0;
        int[] arr = new int[size];
        Node current =  head;
        while (current != null){
            arr[index] = current.value;
            current = current.next;
            index++;
        }
        return arr;
    }
//    reversing a link list

}