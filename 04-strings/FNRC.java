public class FNRC {
    public static char fNRC(String str){
       
       
        for(int i=0;i<str.length();i++){
         int count=0;
         for(int j=0;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)&&i!=j){
                count++;
                break;
            }
           
        }
         if(count==0){
              return str.charAt(i);
            }
         }
        return '\0';
    }

    public static void main(String args[]){
     String str="ramprabhav";
     System.out.println(fNRC(str));

    }
}
