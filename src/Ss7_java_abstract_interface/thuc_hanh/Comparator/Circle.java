package Ss7_java_abstract_interface.thuc_hanh.Comparator;

public class Circle {
    private double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }


    public Circle() {

    }

    public Circle(double v, String indigo, boolean b) {
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
