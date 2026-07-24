public class dividecon {
    public static void mergesort(int arr[],int si,int ei){
        if (si>=ei) {
            return;
        }
        int mid=(si+ei)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
                
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
            
        }
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        
        

    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main (String args[]){
        int arr[]={1,3,2,7,5,9};
        int si=0;
        int ei=arr.length-1;
        mergesort( arr, si, ei);
        printarr(arr);
        

    }
    
    
}
