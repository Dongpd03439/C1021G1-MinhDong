package Ss7_java_abstract_interface.bai_tap.Colorable;

public class Square extends Figure {
    private double canh;

    public Square(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }


    @Override
    public String toString() {
        return "Square{" +
                "canh=" + canh +
                '}';
    }

    @Override
    public double getS() {
        return Math.pow(canh, 2);
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides.");
    }
}
