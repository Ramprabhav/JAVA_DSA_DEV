public class static1 {
    public static void main(String []args){
        student s1=new student();
        s1.schoolname="jvm";
        student s2=new student();
        System.out.println(s2.schoolname);
    }
    
}
class student{
    String name;
    int roll;
    static String schoolname;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }

}
