public class Anagram {
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                if(str1.contains(Character.toString(str2.charAt(i)))&&str2.contains(Character.toString(str1.charAt(i)))!=true){
                   return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]){
      String str1="tiger",str2="gert";
      System.out.println(isAnagram(str1,str2));

    }
    
}
