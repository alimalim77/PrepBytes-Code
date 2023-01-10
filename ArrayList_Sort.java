import java.util.*;    
public class Main 
{
  
public static void main (String[]args)
  {
    ArrayList < String > list = new ArrayList < String > ();
    list.add ("Apple");
    list.add ("Orange");
    list.add ("Cherry");
    list.add ("Apricot");


    System.out.println ("Before: " + list);
    Collections.sort (list);
    System.out.println ("After: " + list);
   } 
} 