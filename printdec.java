public class printdec {
    public class r{
        public void dec(int n){
            if (n==1) {
                System.out.println(n);
                return;
            }
            System.out.println(n+" ");
            dec(n-1);
        }
    }
 
    public static void main(String []args){
        int n=10;
        r p=new r();
        p.dec(n);

    }
    
}
