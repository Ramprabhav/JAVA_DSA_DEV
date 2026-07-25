public class Reverse_Array {
    public static int[] reverse_array(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return arr;
    }
    public static void main (String []args){
        int arr[]={2,5,7,8,9,10};
        reverse_array(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
