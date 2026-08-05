import java.util.*;
public class LargestS {
    public static String largest(String str[]){
     String l=str[0];
     for(int i=1;i<str.length;i++){
        if(l.compareTo(str[i])<0){
        l=str[i];
        }
     }
     return l;
    }
    public static void main(String args[]){
        String f[]={"mango","banana","orange","pineapple"};
        System.out.println(largest(f));
    }
}
