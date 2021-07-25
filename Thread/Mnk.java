class A implements Runnable {
 public void run(){
 
 for (int i=0;i<=3;i++){ 
    // System.out.println(Thread.currentThread().getName());
	System.out.println("Hello World");
	System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
  }}
}
public class Mnk {
  public static void main(String args[]){
	
    Thread t=new Thread(new A()); 
	t.setPriority(Thread.MAX_PRIORITY);  
    t.start(); 
	System.out.println("Main Thread");
	 for (int i=0;i<=3;i++){ 
    // System.out.println(Thread.currentThread().getName());
	System.out.println("main world");
	System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
  }}
	System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
  }
}