import java.util.*;
public class binary_to_decemal {
    public static void binary_to_decemal(int binary)
    {
        int dec=0;
        int pow=0;
        while(binary>0){
            int ld=binary%10;
            dec=dec+(ld*(int)Math.pow(2,pow));
            pow++;
            binary=binary/10;
        }
        System.out.println("decemal is "+dec);
    }
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary number");
        int num=sc.nextInt();
        binary_to_decemal(num);
    }
    
}
