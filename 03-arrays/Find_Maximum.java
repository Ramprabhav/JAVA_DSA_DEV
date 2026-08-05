package Array;

public class Find_Maximum {
    public static int find_max(int num[]){
        int max=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
    public static void main(String []args){
        int num[]={12,24,17,39,25};
        System.out.println("Maximum is : "+find_max(num));
    }
}
