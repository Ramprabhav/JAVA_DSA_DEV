public class inheritance {
  
    public static void main(String[] args) {
        fish f=new fish();
        f.eat();
        f.breath();
         System.out.println(f.color);

    }
}
class animal{
    void eat(){
        System.out.println(" take food");
    }
    void breath(){
        System.out.println(" take breath");
    }
}
class fish extends animal{
    int fings;
     String color="white";
    void swim(){
        System.out.println(" fish are swiming");
     }
}
