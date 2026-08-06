import java.util.*;
public class factorial_recursive_calling {
    public static int factorial(int num)
    {  if(num==0||num==1)
        return 1;

        return num*factorial(num-1);
    }
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter the number of which you want to calculate factorial");
    n=sc.nextInt();
    int result=factorial(n);
    System.out.println("the factorial is:"+result);
    sc.close();
}

    
}
