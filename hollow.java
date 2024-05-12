import java.util.*;
public class hollow {
    public static void hollows(int row,int col)
    {
        
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if (i==1||i==row||j==1||j==col) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    { int row,col;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row");
        row=sc.nextInt();
        System.out.println("enter the number of col");
        col=sc.nextInt();
        hollows(row,col);
        sc.close();

    }
    
}
