public class remov_d {
    public static int remove(int num[]){
        int i=0;
        for(int n:num){
            if (i<2||n!=num[i-2]) {
                num[i++]=n;
                
            }
        }
        return i;
    }
    public static void main(String []args){
        int num[]={1,1,1,2,3,4,4,4,4,5,5,5};
        System.out.println(remove(num));
    }
    
}
