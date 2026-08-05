public class Find_Permutation {
    public static void find_permutation(String s,String a){
        if(s.length()==0){
            System.out.println(a);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
           String ns=s.substring(0, i) + s.substring(i+1);
            find_permutation(ns, a+c);
        }
    }
    public static void main(String args[]){
        String s="abc";
        String a="";
        find_permutation(s, a);

    }
}
