import java.util.*;
public class checknum {
    public void chec(int n){
        if (n%2==0) {
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scan.nextInt();
        chec(n);

    }
   
}
