import java.util.*;
public class function1 {
    public static void sum(int a,int b)//formal parameter is written in function definition
    {
        int s=a+b;
        System.out.println(s+"is sum of a and b");
    };
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        sum(a,b); //argument/actual parameter is written in function call 
    }
    
}
