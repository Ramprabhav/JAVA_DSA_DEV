import java.util.*;
public class sumnth{
    public static void main(String[] args)
    {

    Scanner sc=new Scanner(System.in);
    int i=1;
    int sum=0;
    System.out.println("enter the number till you calculate sum");
    int num=sc.nextInt();
    while (i<=num) {
        sum=sum+i;
        i++;
        
    }
    System.out.println(sum);
  
    }
}
