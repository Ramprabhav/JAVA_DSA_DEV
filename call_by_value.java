public class call_by_value {
    public static void swap(int a, int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);  
    };
    public static void main(String[]args)
    {
        int a=23;
        int b=20;
        swap(a,b);
        System.out.println("after swaping process");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    
}
