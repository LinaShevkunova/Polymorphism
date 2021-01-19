package Polymorph8;

public class Pyramid extends Shape {

    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    //Объем пирамиды равен одной трети произведения площади основания S на высоту h.
    @Override
    public double getVolume() {
        double volume = s * h / 3;
        return volume;
    }
}
