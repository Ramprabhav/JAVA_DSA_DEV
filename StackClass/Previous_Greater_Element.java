import java.util.*;
public class Previous_Greater_Element {
    public static void previous_greater_element(int num[],int ans[]){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<num.length;i++){
            while (!s.empty()&&num[i]>=s.peek()) {
                s.pop();
            }
            if (s.empty()) {
                ans[i]=-1;
            }else{
                ans[i]=s.peek();
            }
            s.push(num[i]);
        }
    }
    public static void main(String []args){
        int num[]={4, 5, 2, 10, 8};
        int ans[]=new int[num.length];
        previous_greater_element(num,ans);
        int i=0;
        while (i<ans.length) {
            System.out.print(ans[i]+" ");
            i++;
        }
    }
}
