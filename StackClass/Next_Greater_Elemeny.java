import java.util.*;
public class Next_Greater_Elemeny {
    public static void next_greater_element(int num[],int ans[]){
       Stack<Integer> s=new Stack<>();
       for(int i=num.length-1;i>=0;i--){
        while(!s.empty()&&num[i]>=s.peek()){
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
        int num[]={4,5,2,10,8};
        int ans[]=new int[num.length];
        next_greater_element(num,ans);
    }
}
