import java.util.*;
public class Reverse_String {
   
    public static String reverse(String s){
         StringBuilder ns=new StringBuilder("");
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
       while (!st.empty()) {
         char ch=st.pop();
         ns.append(ch);
       }
       return new String (ns);
    }
   public static void main(String []args){
    String s="Sahani";
    System.out.println(reverse(s));

   } 
}
