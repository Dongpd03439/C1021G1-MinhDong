package Ss4_java_object_class.thuc_hanh;

import java.awt.*;
import java.util.Scanner;

public class RectangularClass {
    public class RectangleClass {
        double width, height;

        public RectangleClass() {

        }

        public RectangleClass(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        public String display() {
            return "Rectangle{" + "width=" + width + ", height=" + height + "}";
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();


        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the RectangleClass: " + rectangle.getPerimeter());
        System.out.println("Area of the RectangleClass: " + rectangle.getArea());
    }
}








