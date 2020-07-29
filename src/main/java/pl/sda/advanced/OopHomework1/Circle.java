package pl.sda.advanced.OopHomework1;

public class Circle extends Figure{
    private Point p;
    private double r;

    public Circle(double r) {
        this.r = r;
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
        return Math.PI *(r *r);
    }

    @Override
    public double getCircuit() {
        return 2 * Math.PI * r;
    }

    @Override
    public Point[] getEdges() {
        return new Point[0];
    }
}
