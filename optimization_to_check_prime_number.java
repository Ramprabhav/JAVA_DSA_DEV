public class optimization_to_check_prime_number {
    public static Boolean primenumber(int num)
    {
      if (num==2) {
        return true;
      }
      for(int i=2;i<=Math.sqrt(num);i++) 
      {
        if (num%i==0) {
            return false;
        }
        
      } 
      return true;
    }
    public static void print_prime_range(int num)
    {
      
      for(int i=2;i<=num;i++) 
      {
        if (primenumber( i) )
        {
         System.out.println(i);
        }
        
      } 
    }
    
    public static void main(String[]args)
    {
        int num=20;
       Boolean m= primenumber(num);
       System.out.println(m);
       print_prime_range( num);
    }

    
}
