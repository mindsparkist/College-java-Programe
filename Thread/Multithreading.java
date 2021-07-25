public class Multithreading extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        // creating three threads   
        Multithreading t1=new Multithreading();    
        Multithreading t2=new Multithreading();   
        Multithreading t3=new Multithreading();  
        // call run() method   
        t1.start();  
        t2.start();  
        // suspend t2 thread   
        t2.suspend();   
        // call run() method   
        t3.start();  
        t2.resume();
    }    
}