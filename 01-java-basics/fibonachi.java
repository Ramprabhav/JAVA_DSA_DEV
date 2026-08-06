public class fibonachi {
    public static int fibo(int n){
        if (n==0||n==1) {
            return n;
            
        }
        int r=fibo(n-1)+fibo(n-2);
        return r;
    }
    public static void main(String []args){
        int n=3;
        System.out.println(fibo(n));
    }
    
}
