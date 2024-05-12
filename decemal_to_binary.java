import java.util.*;
public class decemal_to_binary {
    public static void decemal_to_binary(int decemal_number)
    {
        int binary=0;
        int pow=0;
        while(decemal_number>0)
        {
            int rem=decemal_number%2;
            binary=binary+(rem*(int)Math.pow(10,pow));
            pow++;
            decemal_number=decemal_number/2;
        }
        System.out.println("binary number is "+binary);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the decemal number");
        int dec=sc.nextInt();
        decemal_to_binary(dec);

    }
}
