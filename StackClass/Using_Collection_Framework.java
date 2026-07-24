import java.util.*;
public class Using_Collection_Framework {
    public static void main(String []args){
      Stack<Integer> s=new Stack<>();
      s.push(10);
      s.push(20);
      s.push(30);
      s.push(40);
      s.push(50);
      s.pop();
      s.push(100);
      s.peek();
      System.out.println("size of stack : "+s.size());
      while (!s.empty()) {
        System.out.println(s.peek());
        s.pop();
      }
    }
}
