public class substring {
    public static String substring(String str,int si,int ei){
        String subs=" ";
        for(int i=si;i<=ei;i++){
            subs+=str.charAt(i);
        }
        return subs;
    }
    public static void main(String args[]){
        String str="ramprabhav";
        System.out.println(substring( str,3,9));
    }
    
}
