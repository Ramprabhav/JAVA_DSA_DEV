import java.util.Stack;

public class Next_Smaller_Element {
    public static void next_smaller_element(int num[],int ans[]){
     Stack<Integer>s=new Stack<>();

     for(int i=num.length-1;i>=0;i--){
        while(!s.empty()&&num[i]<=s.peek()){
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
        int num[]={4, 8, 5, 2, 25};
        int ans[]=new int [num.length];
        next_smaller_element(num,ans);
        int i=0;
        while (i<ans.length) {
            System.out.print(ans[i]+" ");
            i++;
        }
    }
}
