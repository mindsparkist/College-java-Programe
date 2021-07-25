class Mythread implements Runnable {
 public void run(){
 for (int i=0;i<=3;i++){ System.out.println(Thread.currentThread().getName());
 System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
  }}
}
public class mnk1 {
  public static void main(String args[]){
    Mythread myt=new Mythread();
    Thread t=new Thread(myt,"Mainak"); // user defined thread 
	t.setPriority(10);  
    t.start();
      
	for (int i=0;i<=3;i++){  
	//System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
	 // System.out.println("Main Thread");
	  Thread.currentThread().setPriority(1);
        System.out.println(
            "Main thread priority : "
            + Thread.currentThread().getPriority());
       }
	  
  
  }
}