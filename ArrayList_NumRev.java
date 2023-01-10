import java.util.*;    
public class Main
{
  
public static void main (String[]args)
  {
    ArrayList < Integer > list = new ArrayList < Integer > ();
    list.add (4);
    list.add (96);
    list.add (-13);
    list.add (5);


    System.out.println ("Before: " + list);
    Collections.sort (list,Collections.reverseOrder());
    System.out.println ("After: " + list);
   } 
} 