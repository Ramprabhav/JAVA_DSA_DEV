public class FindSP {
    public static int sp(String p){
        int x=0;
        int y=0;
        int d=0;
        for(int i=0;i<p.length();i++){
            char c=p.charAt(i);
            if(c=='E'){
             x++;
            }
              if(c=='N'){
                y++;
            }
              if(c=='W'){
               x--; 
            }
              if(c=='S'){
               y--; 
            }
        }
        d=(int)Math.sqrt(x*x+y*y);
        return d;
    }
    public static void main(String args[]){
        String p="EWNSSENEWNN";
        System.out.println(sp(p));
    }
}
