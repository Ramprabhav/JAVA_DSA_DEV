public class Find_Subset {
    public static void subset(String s,String a,int i){
        if(i==s.length()){
            System.out.println(a);
            return;
        }
        subset(s,a+s.charAt(i),i+1);
        subset(s,a,i+1);
    }
    public static void main(String []args){
        String s="abc";
        String a="";
        subset(s,a,0);

    }
}
