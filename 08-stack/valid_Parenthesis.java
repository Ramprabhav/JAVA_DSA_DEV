import java.util.*;
public class valid_Parenthesis {
    public static boolean valid_parenthesis(String str){
        Stack<Character> S=new Stack<>();
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(ch=='('||ch=='{'||ch=='['){
              S.push(ch);
           }else{
            if(S.empty()){
                return false;
            }
            if((S.peek()=='('&&ch==')')||(S.peek()=='['&&ch==']')||(S.peek()=='{'&&ch=='}')){
                S.pop();
            }else{
                return false;
            }
           }
        }
        return true;

    }
    public static void main(String []args){
      String str="{[()]}";
      System.out.println("Valid Parenthesis  : "+valid_parenthesis(str));
    }
}
