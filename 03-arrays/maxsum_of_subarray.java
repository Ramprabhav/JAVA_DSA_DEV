public class maxsum_of_subarray {
    public static void maxsum(int array[]){
        int current=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int k=i;k<=j;k++){
                    current += array[k];
                }
                System.out.println(current);
                if (max<current) {
                    max=current;
                    
                }
                
            }
        }
        System.out.println("the maximum sum of subarray is "+max);
    }
    public static void main(String[] args) {
        int array[]={1,4,2,6};
        maxsum(array);
    }
    
}
