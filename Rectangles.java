
public class Rectangles {
    public double length;
    public double breadth;

    public Rectangles(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void perimeter() {
        System.out.println("perimeter= " + 2 * (length + breadth));
    }

    public void area() {
        System.out.println("area= " + (length * breadth));
    }
        public static void main(String[] args) {
        Rectangles R = new Rectangles(4,6);
        R.perimeter();
        R.area();
    }
}

class CalculatorAreaPerimeter {

}
