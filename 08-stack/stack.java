import java.util.ArrayList;
public class stack {
    Static class stackk{
        Static ArrayList<Integer>List=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[]args){
        Stackk s=new stackk();
        s.push(3);
        s.push(8);
        s.push(1);
        s.push(2);
        s.peek();
        
    }

    
}
