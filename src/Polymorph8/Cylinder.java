package Polymorph8;

public class Cylinder extends SolidOfRevolution {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    //Объем цилиндра равен произведению числа пи (3.1415) на квадрат радиуса основания на высоту.
    @Override
    public double getVolume() {
        double volume = (3.1415 * Math.pow(getRadius(),2) * height);
        return volume;
    }
}
