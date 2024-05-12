public class Person {
    // Private fields
    private String name;
    private int age;
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    // Getter for age
    public int getAge() {
        return age;
    }
    // Setter for age
    public void setAge(int age) {
        if (age >= 0) { // Validate age (assuming age cannot be negative)
            this.age = age;
        } else {
            System.out.println("Invalid age. Age cannot be negative.");
        }
    }
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John", 30);
        // Demonstrate getter and setter methods
        System.out.println("Original name: " + person.getName());
        System.out.println("Original age: " + person.getAge());
        // Update name and age using setter methods
        person.setName("Alice");
        person.setAge(25);
        // Display updated information
        System.out.println("Updated name: " + person.getName());
        System.out.println("Updated age: " + person.getAge());
    }
}

