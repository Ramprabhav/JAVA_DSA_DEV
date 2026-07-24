import java.util.*;
public class basic{
    public static void main(String args[])
    {
   ArrayList<Integer>num=new ArrayList<Integer>();
   num.add(5);
   num.add(2);
   num.add(7);
   num.add(70);
   num.forEach((n)->{
    System.out.println(n);
   });
try{
    System.out.println("hello");
}
 catch(Exception e){
    System.out.println("");
 }  
   
}finally{
    System.out.println("the try catch i");
}
throw new ArithmaticException("");