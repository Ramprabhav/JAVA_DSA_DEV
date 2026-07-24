import java.util.*;
public class Stock_Span {
    public static void stock_span(int Stock[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<Stock.length;i++){
            int current_price=Stock[i];
            while(!s.empty()&&current_price>=Stock[s.peek()]){
                s.pop();
            }
            if (s.empty()) {
                span[i]=i+1;
            }else{
                span[i]=i-s.peek();
            }
            s.push(i);
        }
    }
    public static void main(String []args){
        int Stock[]={100,80,60,70,60,85,100};
        int span[]=new int[Stock.length];
        stock_span(Stock,span);
        int i=0;
        while(i<span.length){
         System.out.print(span[i]+" ");
         i++;
        }
    }
}
