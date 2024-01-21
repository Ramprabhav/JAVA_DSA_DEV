import java.util.*;
public class area {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("enter the radious");
        float rad=sr .nextFloat();
        double area;
        area=3.14*rad*rad;
        System.out.println(area);
        sr.close();
        //type conversion in java
        int a=(int)area;
        System.out.println(a);
    }
    
}
