class PrepBytes implements Runnable{  
public void run(){  
System.out.println("Thread runs");  
}  
  
public static void main(String args[]){  
PrepBytes pb = new PrepBytes();  
Thread tOne = new Thread(pb);   // constructor Thread(Runnable r)  is used here
tOne.run();  
 }  
}  