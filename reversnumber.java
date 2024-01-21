import java.util.*;
public class reversnumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number to which you want to print in revers order");
        int num=sc.nextInt();
        int re=0;
        while (num>0) {
            int r=num%10;
            re=(re*10)+r;
            num=num/10;
        }
        System.out.print(re+"is revers number of given number");
sc.close();
    }
    
}

