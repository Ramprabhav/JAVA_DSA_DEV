public class palindrome {
    public static boolean palindro(String str){
        int i=0;
        int n=str.length();
        for(i=0;i<n/2;i++){
            if (str.charAt(i)!=str.charAt(n-1-i)) {
             return false;  
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(palindro(str));
        
    }
    
}
