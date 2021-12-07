package Ss5_java_accessmodifier_static.bai_tap;

public class Circle {
    private double radius = 5 ;
    private  String color = "red";

    public Circle() {

    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return  this.radius*this.radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public static void main(String[] args) {
        Circle sc = new Circle();
        System.out.println("Bán Kính Hình Tròn  = "+ sc.getRadius());
        System.out.println( "Diện Tích Hình Tròn "+sc.getArea());

    }
}

