class A implements Runnable{
	public void run (){
		int i;
		for(i=0;i<=10;i++){
			 System.out.println("Thread A " + i);
			 System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
		}
	}
}
class B implements Runnable{
	public void run (){
		int i;
		for(i=0;i<=10;i++){
			 System.out.println("Thread B " + i);
			 System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
		}
	}
}
public class T {
  public static void main(String[] args) {
    Thread threadObject_1 =new Thread(new A());
	Thread threadObject_2 =new Thread(new B());
	threadObject_1.setPriority(Thread.MAX_PRIORITY);  
	threadObject_1.start();
	threadObject_2.start();
  }
}