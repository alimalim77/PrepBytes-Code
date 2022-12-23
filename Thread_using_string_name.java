public class PrepBytes {
    
public static void main(String argvs[]){  
Thread tOne = new Thread("Thread String");  
  
tOne.start();  
String name = tOne.getName();  
System.out.println(name);  

}  
}  