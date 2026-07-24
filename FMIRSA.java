public class FMIRSA {
    public static int find_Min(int num[]){
        int l=0;
        int r=num.length-1;
        while(l<r){
        int m=l+(r-l)/2;
        if(num[m]>num[r]){
            l=m+1;
        }else{
            r=m;
        }
        }
     return num[l];
    }
    public static void main(String []args){
        int num[]={4,5,1,2,3};
        System.out.println(find_Min(num));
    }
}
