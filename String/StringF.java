public class StringF{
    public static void main(String args[]){
        //find length of string
        String str="pragramming";
        System.out.println(str.length());

        //find whether the  string has more than 10 character
        if(str.length()>10){
            System.out.println("String long");
        }else{
            System.out.println("string short");
        }

        //count number of charcter in string
       int count=str.length();

       //print the first 3 character
       System.out.println("fisrt 3 character   : "+str.substring(0,3));

       //last 4 character
       System.out.println("last 4th character  : "+str.substring(str.length()-4));

       //4. equals()...check whether two entered passwords are the same
       
       String pass1="ram@123";
       String pass2="ram@123";
       System.out.println(pass1.equals(pass2));

       //5.  equalsIgnoreCase()  check whether the entered word
       String pass3="Ram@123";
       System.out.println(pass1.equalsIgnoreCase(pass3));

       //6. compareTo()
       System.out.println(pass1.compareTo(pass2));
       
       if(str.compareTo(pass1)<0){
        System.out.println(str);
        System.out.println(pass1);
       }else{
        System.out.println(pass1);
        System.out.println(str);
       }

       //toCharArray()...
       //converts a String into a character array
       String s="Java";
       char arr[]=s.toCharArray();
       // repeat()

       String st="hi";
       System.out.println(st.repeat(3));
       //contains()
       System.out.println(str.contains("p"));

       System.out.println(str.indexOf("p"));

       System.out.println(str.startsWith("p"));

       System.out.println(str.endsWith("p"));
       System.out.println(str.lastIndexOf("i"));

       System.out.println(str.replace("p","P"));

       String S="Apple,Banana,Mango";
       String ar[]=s.split(",");

       String j=String.join("-","2026","07","16");
       System.out.println(j);

   }
}