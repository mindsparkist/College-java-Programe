class A{
	  void static show(){
		System.out.println("A");
	}
	
}
class B extends A{
	  void show(){
		System.out.println("B");
	}
}
public class Main {
    public static void main(String[] args) {
        B obj1 = new A();
		obj1.show();
    }
}


