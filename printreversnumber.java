import java.util.*;
public class printreversnumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number to which you want to print in revers order");
        int num=sc.nextInt();
        while (num>0) {
            int r=num%10;
            System.out.print(r);
            num=num/10;
        }
sc.close();
    }
    
}
