import java.util.*;
public class prime_number {
    public static void prime(int num)
    {
        int i;
        if(num==2)
    System.out.println(num+"prime number");
        for(i=2;i<=num-1;i++)
        {
            if(num%i==0)
            {
            System.out.println(num +" is not prime number");
            break;
           }
           
         }
        System.out.println(num+"prime number");
    };
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        prime(num);
    }
    
}
