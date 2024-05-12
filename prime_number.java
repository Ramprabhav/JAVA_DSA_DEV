import java.util.*;
public class prime_number {
    public static void prime(int num)
    {
        int i,m=0;
        if(num==2)
    System.out.println(num+"prime number");
        for(i=2;i<=num-1;i++)
        {
            if(num%i==0)
           {
            m=1;
            break;
           }
           
         }
         if (m==1) {
            System.out.println(num +" is not prime number");
            
         }
        System.out.println(num+" is prime number");
    };
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        prime(num);
    }
    
}
