public class Remove_Duplicates {
    public static int remove_dublicate(int num[]){
           int p=0;
        for(int i=0;i<num.length;i++){
            int count=0;
            for(int j=i;j<num.length;j++){
                 if(num[i]==num[j]&&i!=j){
                    count++;
                    break;
                 }
                 
        }
        if (count==0) {
         num[p++]=num[i];
         }
     }
     return p;
    }
  public static void main(String []args){
    int arr[]={1, 1, 2, 2, 3, 3, 5, 5};
    int size=remove_dublicate(arr);
    for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }

  }  
}
