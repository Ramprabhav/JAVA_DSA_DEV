public class PrintSpiral {
    public static void print_spiral(int m[][]){
        int sr=0;
        int sc=0;
        int er=m.length-1;
        int ec=m[0].length-1;
        while(sr<=er&&sc<=ec){
            for(int i=sr;i<=ec;i++){
                System.out.print(m[sr][i]);
            }
            for(int i=sr+1;i<er;i++){
                System.out.print(m[i][ec]);
            }
            for(int i=sr+1;i<er;i++){
                System.out.print(m[i][ec]);
            }
           for(int i=ec-1;i>=sc;i--){
            if(sr==er){
                break;
            }
            System.out.println(m[er][i]);
           }
        }
        for(int i=er-1;i>=sr+1;i--){
            if(sr==er){
                break;
            }
            System.out.println(m[i][sc]);
           }
        }
        sc++;
        sr++;
        ec--;
        er--;
        System.out.print();
        
    }
    
    public static void main(String[]args){
        int m[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print_spiral(m);
    }
}
