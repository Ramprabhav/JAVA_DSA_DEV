public class recurtion {
    public static void printdec(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printdec(n-1);
    }
    public static void printinc(int n){
        if (n==1) {
           System.out.println(n);
           return;
            
        }
        printinc(n-1);
        System.out.println(n);
    }
    public static void main(String[]args){

        //printdec(10);
        printinc(10);
    }
    
}
