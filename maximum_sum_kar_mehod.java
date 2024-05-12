public class maximum_sum_kar_mehod {
    public static void maximum_value(int array[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            cs +=array[i];
            if (cs<0) {
                cs=0;
            }
            ms=Math.max(ms, cs);
        }
        System.out.println("the maximum sum is "+ ms);
    }
    public static void main(String[] args) {
        int array[]={-1,3,-2,7,1,-4};
        maximum_value( array);


    }
    
}
