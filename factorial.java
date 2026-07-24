public class factorial {
    public static int fact(int n){
        if (n==1||n==0) {
            return 1;
            
        }
        int f1=n*fact(n-1);
       return f1;
    }
    public static void main (String[]args){
        System.out.println("the factorial is : " + fact(5));
    }
    
}
