public class Frequency_Of_An_Element {
    public static int frequency_of_an_element(int arr[],int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
            }
        }
        return count;

    }
   public static void main(String[]args){
    int arr[]={1,2,4,1,2,6,5,4};
    int k=4;
    System.out.print(frequency_of_an_element(arr,k));
   } 
}
