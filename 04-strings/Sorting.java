public class Sorting {
    public static String sortS(String str){
        int p=0;
        char ch[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
               ch[p++]=str.charAt(i);
            }
        }
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length;j++){
                if(ch[i]<ch[j]&&i!=j){
                    char c= ch[i];
                    ch[i]=ch[j];
                    ch[j]=c;
                }
            }
        }
        return new String(ch);
    }
    public static void main(String []args){
        String str="hello Engineer";
        System.out.println(sortS(str));
    }
}
