import java.util.*;
public class inverted_half_pyramid {
public static void  inverted(int row ,int col)
{
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=row-i;j++){
          System.out.print(" ");
        }
       for(int j=1;j<=i;j++)
       {
        System.out.print("*");
       }
       System.out.println();
    }
}
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    int row,col;
    
    System.out.println("enter the number of row");
    row=sc.nextInt();
    System.out.print("enter the number of column");
    col=sc.nextInt();
    inverted(row, col);
}
    
}
