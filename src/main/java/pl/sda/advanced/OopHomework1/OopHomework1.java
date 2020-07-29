package pl.sda.advanced.OopHomework1;

import pl.sda.advanced.oop2.Person;

public class OopHomework1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getCircuit());

        Circle circle= new Circle(4);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircuit());

        Square square = new Square(3);
        System.out.println(square.getArea());
        System.out.println(square.getCircuit());

        Point point = new Point(3,4);




    }
}
