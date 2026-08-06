import java.net.SocketPermission;
import java.util.Scanner;

public class string {
    public static void main(String args[]){
        /*String str="ramprabhav sahani";
        System.out.println(str);
        //lenght of string...
        System.out.println("length of string   " + str.length());
        //input string from user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str1=sc.nextLine();//take number of word as a input
        String str2=sc.next();//it take only one word as a input
        System.out.println(str1);
        System.out.println(str2); */
        // concatenation of strings....
        String a="ramprabhav";
        String b="sahani";
        String fullname=a+" "+b;
        System.out.println(fullname);
        for(int i=0;i<fullname.length();i++){
            System.out.print(fullname.charAt(i)+ " ");
        }


    }
    
}

