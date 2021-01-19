package Polymorph8;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
    }

    /*Объем шара равен четырем третим от его радиуса в кубе помноженого на число пи.
    Где V - объем шара, R - радиус шара, π = 3.141592.
    */
    @Override
    public double getVolume() {
        double volume = (4 / 3) * (Math.pow(getRadius(),3) * 3.1415);
        return volume;
    }
}