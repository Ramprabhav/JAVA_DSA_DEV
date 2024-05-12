public class print_all_prime_number_in_range {
    public static Boolean print_prime_range(int num)
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
    
}
