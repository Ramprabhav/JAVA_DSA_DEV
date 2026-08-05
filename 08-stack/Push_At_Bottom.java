import java.util.*;
public class Push_At_Bottom {
    // First Approach to push element at bottom
    public static void PAB(Stack <Integer>s,int d){
      Stack<Integer> ns=new Stack<>();
      while(!s.empty()){
        ns.push(s.pop());
      }
      s.push(d);
      while(!ns.empty()){
        s.push(ns.pop());
      }
      return;
    }
    //second approach to push element at bottom into stack
    public static void push_at_bottom(Stack<Integer> s,int d){
        if (s.empty()) {
            s.push(d);
            return;
        }
        int top=s.pop();
        push_at_bottom( s, d);
        s.push(top);
        return;

    }
    public static void main(String []args){
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        PAB(s, 5);
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}
