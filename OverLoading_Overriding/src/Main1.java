class A {
    public static void f1() {
        System.out.println("A");
    }
}

class B extends A {
    static public void f1() {
        System.out.println("B");
    }
}


public class Main1 {
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.f1();
    }
}
