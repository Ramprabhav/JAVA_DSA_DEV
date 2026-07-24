

public class Basic_strin_class {
 public static void main(String args[]){
     String str="ramprabhav sahani";
     String str1="prabhav";
     String text=" i am a student ";
     //System.out.println(str);
     //System.out.println(str.length());
    // for(int i=0;i<str.length();i++){
      //  System.out.print(str.charAt(i)+" ");
    // }
    String newstr=text+str1;
    
    System.out.println("concatinate text and str1 "+newstr);

    System.out.println(str1+","+text);

    System.out.println(str.toUpperCase());//it convert each character to Upper case.


     System.out.println(str.toLowerCase());//it convert each charater of string to lower case.


     System.out.println(str.indexOf("sahani"));//it tell index of given string


     //equals()....compare two string
     System.out.println(str.equals(str1));


     //trim()... use to remove white space from bigning and ending white space.
     System.out.println(text.trim());

    //concat()....use to concate two string
    System.out.println(str.concat(str1));

    //
    }
    
}
