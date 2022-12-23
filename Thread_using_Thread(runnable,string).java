public class PrepBytes implements Runnable{
    
public void run(){    
System.out.println("Thread is running");    
}    
    
public static void main(String argvs[]){   
  
Runnable rOne = new PrepBytes();   
Thread tOne = new Thread(rOne, "Thread Runs");    
  

tOne.start();   
String name = tOne.getName();  
System.out.println(name);  
}    
} 