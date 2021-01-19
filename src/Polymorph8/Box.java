package Polymorph8;
/* Кейсы:
1. Фигуры, перемещенные в коробку, ее не заполняют
2. Фигуры, перемещенные в коробку, больше ее по объему
3. Информация о доступном свободном пространстве в коробке
4. Информация о конечной заполненности коробки
 */

public class Box extends Shape {

    private double boxVolume;

    public boolean add(Shape shape) {
        boxVolume = boxVolume - shape.getVolume();
        if (boxVolume > 0) {
            System.out.println("Коробка еще не заполнена. Осталось " + boxVolume + " м3" + '\n');
            return true;
        } else {
            System.out.println("Коробка заполнена. Допустимый объем превышен на " + boxVolume + " м3");
            return false;
        }
    }
    public Box(double boxVolume) {
        this.boxVolume = boxVolume;
        System.out.println("Объем коробки равен " + boxVolume + " м3" + '\n');
    }
}
