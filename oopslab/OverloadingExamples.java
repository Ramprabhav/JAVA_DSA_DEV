public class OverloadingExamples {
    // Constructor overloading
    public OverloadingExamples() {
        System.out.println("Default constructor");
    }
        public OverloadingExamples(int num) {
        System.out.println("Parameterized constructor with integer: " + num);
    }
        public OverloadingExamples(double num) {
        System.out.println("Parameterized constructor with double: " + num);
    }
        // Method overloading
    public void display() {
        System.out.println("Method without parameters");
    }
        public void display(int num) {
        System.out.println("Method with integer parameter: " + num);
    }
        public void display(double num) {
        System.out.println("Method with double parameter: " + num);
    }
        public static void main(String[] args) {
        // Creating objects using different constructors
        OverloadingExamples obj1 = new OverloadingExamples();
        OverloadingExamples obj2 = new OverloadingExamples(10);
        OverloadingExamples obj3 = new OverloadingExamples(5.5);
         // Invoking methods with different parameters
        obj1.display();
        obj2.display(20);
        obj3.display(7.7);
    }
}

