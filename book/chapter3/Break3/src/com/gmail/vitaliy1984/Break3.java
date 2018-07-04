package com.gmail.vitaliy1984;

/**
 * Файл класса Break3.
 * Программа показывающие работу оператора break во вложенном цикле
 *
 * @author Виталий Магнум
 */
public class Break3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Счетчик вешнего цикла: " + i);
            System.out.print("    Счетчик внутреннего цикла: ");

            int t = 0;
            while (t < 100) {
                if (t == 10) {
                    break; // прерываем цикл, если t = 10
                }
                System.out.print(t + " ");
                t++;
            }

            System.out.println();
        }

        System.out.println("Циклы завершены.");
    }
}
