import java.util.*;
public class printpairs {
                       public static void printpairrr(int number[])
    {
        for(int i=0;i<number.length;i++)
        {
            for(int j=i;j<number.length;j++){
                for(int k=i;k<=j;k++)
                {
                   System.out.println(number[k]+" ");
                   System.out.print("");
                }
                System.out.println();
        }

            }
            
        }
        public static void main(String args[]){
            int number[]={2,4,3,7,8,1};
            printpairrr(number);
            }
    }