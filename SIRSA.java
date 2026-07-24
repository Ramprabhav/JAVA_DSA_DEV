public class SIRSA {
    public static int search_Element(int arr[],int tar){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int m=s+(e-s)/2;
            if (arr[m]==tar) {
                return m;
            }
            else if(arr[s]<arr[m]){
                if (arr[s]<=tar&&tar<=arr[m]) {
                    e=m-1;
                }else{
                    s=m+1;
                }
            }else{
                if (arr[m]<=tar && tar<=arr[e]) {
                    s=m+1;
                }else{
                    e=m-1;
                }
            }

        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={3,4,5,6,0,1,2};
        int i=search_Element(arr, 1);
        if (i==-1) {
            System.out.println("element is not found or not exiest");
        }else{
            System.out.println("element is at index : "+ i );
        }
    }
}
