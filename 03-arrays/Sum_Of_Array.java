package Array;
public class Sum_Of_Array {
    public static void main(String []args){
        int arr[]={1,4,2,7,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}
