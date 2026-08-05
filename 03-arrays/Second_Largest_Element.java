public class Second_Largest_Element {
    public static int second_largest_element(int num[]){
        int fl=num[0];
        int sl=num[0];
        for(int i=1;i<num.length;i++){
           if(num[i]>fl){
            fl=num[i];
           }
           else if(num[i]>sl&&sl!=fl){
            sl=num[i];
           }
        }
        return sl;
    }
   public static void main(String[]args){
    int num[]={12,45,27,82,70,33};
    System.out.print("The second largest element : "+second_largest_element(num));
   } 
}
