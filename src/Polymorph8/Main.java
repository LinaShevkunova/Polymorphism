package Polymorph8;

public class Main {
    public static Shape pyramid = new Pyramid(7,2);
    public static Shape cylinder = new Cylinder(4, 2);
    public static Shape ball = new Ball(3);

    public static void main(String[] args) {
        Box box = new Box(500);
        boolean fullBox = true;

        while (fullBox) {
            fullBox = box.add(shapeType());
        }
    }

    public static Shape shapeType() {
        System.out.println(String.format("Доступные фигуры: " + '\n' + "1 - пирамида (объем = %s м3) \n2 - цилиндр (объем = %s м3) \n3 - шар (объем = %s м3)", pyramid.getVolume(), cylinder.getVolume(), ball.getVolume()) + '\n');
        System.out.println("Введите номер фигуры, чтобы положить ее в коробку:");
        int num = Input.getInt();
        if (num == 1) {
            return pyramid;
        } else if (num == 2) {
            return cylinder;
        } else if (num == 3) {
            return ball;
        } else {
            System.out.println("Такого номера нет в списке доступных фигур. Повторите ввод.");
            return shapeType();
        }
    }
}
