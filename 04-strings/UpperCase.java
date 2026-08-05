public class UpperCase {
    public static StringBuilder upperC(String str){
        str=str.trim();

        StringBuilder ns=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        ns.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                ns.append(str.charAt(i));
                i++;
                ns.append(Character.toUpperCase(str.charAt(i)));
            }else{
                ns.append(str.charAt(i));
            }
        }

      return ns;


    }
   public static void main(String args[]){
    String str=" i am ramprabhav sahani  ";
    System.out.println(upperC(str));
   } 
}
