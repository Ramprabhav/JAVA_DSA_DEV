import java.util.*;
public class twodarray {
    public static boolean search(int matrix[][],int k){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==k) {
                    System.out.print("element is found at cell ("+ i +","+j+")");
                    return true;
                }
                
            }
            
        }
        System.out.print("not found");
        return false;

    }
    public static void main(String args[]){
        int matrix[][]=new int [3][3];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();


            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.print("search element and enter");
        int k=sc.nextInt();

        search(matrix, k);

    }
    
}
