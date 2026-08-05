import java.util.*;
public class Compressed {
    public static String comp(String str){
        String ns="";
       
        int count=1;
        int n=str.length();
        for(int i=1;i<n;i++){
          if(str.charAt(i)==str.charAt(i-1)){
            count++;
          }else{
            ns=ns+str.charAt(i-1);
            if(count!=1){
                ns=ns+count;
                
            }
            count=1;
          }
        }
          ns = ns + str.charAt(n - 1);

        if(count != 1){
        ns = ns + count;
    }

        return ns;
    }
    public static void main(String args[]){
        String str="aaabbcccdddd";
        System.out.println(comp(str));
    
    }
}
