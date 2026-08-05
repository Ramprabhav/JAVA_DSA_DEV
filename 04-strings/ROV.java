public class ROV {
    
    public static String reverseOnlyVowel(String str){
        int l=0;
        int r=str.length()-1;
        char []ch=str.toCharArray();
        while (l<r) {
            if(str.charAt(l)=='a'||str.charAt(l)=='e'||str.charAt(l)=='o'||str.charAt(l)=='u'||str.charAt(l)=='i' && str.charAt(r)=='a'||str.charAt(r)=='e'||str.charAt(r)=='o'||str.charAt(r)=='u'||str.charAt(r)=='i'){
              char c=str.charAt(l);
              ch[l]=str.charAt(r);
              ch[r]=c;
              l++;
              r--;
            }
            else if(str.charAt(l)!='a'||str.charAt(l)!='e'||str.charAt(l)!='o'||str.charAt(l)!='u'||str.charAt(l)!='i'){
                l++;
            }else if(str.charAt(l)!='a'||str.charAt(l)!='e'||str.charAt(l)!='o'||str.charAt(l)!='u'||str.charAt(l)!='i'){
                r--;
            }
        }
        str=new String(ch);
        return str;
    }
    public static void main(String args[]){
        String str="hello";
        System.out.println(reverseOnlyVowel(str));
    }
}
