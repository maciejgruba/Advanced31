package pl.sda.advanced.OopHomework1;

public class Rectangle extends Figure {
    private Point p;
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircuit() {
        return 2 * (width + height);
    }

    @Override
    public Point[] getEdges() {
        return new Point[0];
    }
}
