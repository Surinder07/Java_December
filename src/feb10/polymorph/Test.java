package feb10.polymorph;

public class Test {
    public static void main(String[] args) {

        Circle circle = new Circle(12);
        System.out.println("Area of circle :"+circle.getArea());

        Rectangle rectangle = new Rectangle(10.0,20.0);
        System.out.println("Area of Rectangle : "+rectangle.getArea());

        Square square = new Square(10);
        System.out.println("Area of square : "+square.getArea());


    }
}
