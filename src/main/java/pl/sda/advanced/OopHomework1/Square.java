package pl.sda.advanced.OopHomework1;

public class Square extends Figure{
    private Point p;
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getCircuit() {
        return 4 * side;
    }

    @Override
    public Point[] getEdges() {
        return new Point[0];
    }
}
