import java.util.*;

public class co{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
int num;
do{
    System.out.println("enter the number");
    num=sc.nextInt();
    if(num%10==0)
    {
        continue;
    }
    System.out.println(num);
}while(true);

 }
    
}
