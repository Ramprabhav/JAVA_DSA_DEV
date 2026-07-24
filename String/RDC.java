public class RDC {
    public static String rDublicate(String str){
        String ns="";
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)&&i!=j){
                    count++;
                    break;
                }
            }
            if(count==0)
            ns=ns+str.charAt(i);
        }
        return ns;
    }
    public static void main(String []args){
        String str="ramprabhav";
        System.out.println(rDublicate(str));
    }
}
