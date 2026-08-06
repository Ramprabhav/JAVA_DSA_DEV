class A{
    public static int sum_Diagonal(int num[][]){
        int sum=0;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                if(i==j){
                    sum=sum+num[i][j];
                }
                else if(i+j==num.length-1){
                    sum=sum+num[i][j];
                }
            }
        }
     return sum;
    }
}
public class Sum_Of_Diagonal {
 public static void main(String[]args) {
   int num[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
   System.out.println("sum of diagonal : "+A.sum_Diagonal(num));
 }  
}
