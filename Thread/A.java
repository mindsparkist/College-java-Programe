
public class A extends Thread  
{    
    public void run()  
    {    
	
	    String name=Thread.currentThread().getName();
        for(int i=1; i<=3; i++)  
        {    
               System.out.println(name);
        }    
    }    
    public static void main(String args[]) throws InterruptedException {    
          
        A t1=new A();    
        A t2=new A();   
        A t3=new A();   
        
		t1.setName("Raj");
		t1.setName("Gill");
		t1.setName("Sen");
		
        t1.start();  
        t2.start();  
        
        t2.suspend();   
       
        t3.start();  
        t2.resume();
    }    
}