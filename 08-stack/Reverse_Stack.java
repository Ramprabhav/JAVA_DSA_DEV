import java.util.*;
public class Reverse_Stack {
    public static void push_at_bottom(Stack<Integer> s,int d){
        if(s.empty()){
            s.push(d);
            return;
        }
             int top=s.pop();
             push_at_bottom(s, d);
             s.push(top);        
    }
    public static void reverse_stack(Stack<Integer> s){
        if (s.empty()) {
            return;
        }
        int top=s.pop();
        reverse_stack(s);
        push_at_bottom(s, top);
    }
    public static void main(String []args){
Stack<Integer> s=new Stack<>();
s.push(10);
s.push(20);
s.push(30);
s.push(40);
reverse_stack(s);
while (!s.empty()) {
    System.out.println(s.peek());
    s.pop();
}
    }
}
