import java.util.*;    
public class ArrayList_ReverseSort
{
  
public static void main (String[]args)
  {
    ArrayList < String > list = new ArrayList < String > ();
    list.add ("Apple");
    list.add ("Orange");
    list.add ("Cherry");
    list.add ("Apricot");


    System.out.println ("Before: " + list);
    Collections.sort (list, Collections.reverseOrder());
    System.out.println ("After: " + list);
   } 
} 