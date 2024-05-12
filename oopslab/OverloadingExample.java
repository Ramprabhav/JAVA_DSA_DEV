public class OverloadingExample {
    // Constructor overloading
    public OverLoadingExample() {
        System.out.println("Default constructor");
    }
        public OverLoadingExample(int num) {
        System.out.println("Parameterized constructor with integer: " + num);
    }
        public OverLoadingExample(double num) {
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
        OverLoadingExample obj1 = new OverLoadingExample();
        OverLoadingExample obj2 = new OverLoadingExample(10);
        OverLoadingExample obj3 = new OverLoadingExample(5.5);
         // Invoking methods with different parameters
        obj1.display();
        obj2.display(20);
        obj3.display(7.7);
    }
}

