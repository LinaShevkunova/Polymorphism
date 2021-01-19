package Polymorph8;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    //метод валидации - не числовые значения
    public static int getInt() {
        if(scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        System.out.println(String.format("Вы ввели нечисловое значение %s. Повторите ввод.", scanner.next()));
        return getInt();
    }
}
