package Ss6_java_inheritance.bai_tap.bai1;

public class Cylinder extends Circle {
    private double chieuCao ;

    public Cylinder(double radius, String color, double chieuCao) {
        super(radius, color);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double tinhTheTich(){
        return  Math.PI* Math.pow(getRadius(), 2) * getChieuCao();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "chieuCao=" + chieuCao +
                '}';
    }

}
