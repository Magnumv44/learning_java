package com.gmail.vitaliy1984;

/**
 * Файл класса Breakdemo.
 * Программа демонстрирующая работу оператора break
 * для выхода из цикла
 *
 * @author Виталий Магнум
 */
public class BreakDemo {
    public static void main(String[] args) {
        int num = 100;

        /* Выполнять цикл до тех пор, пока квадрат значения
           переменной "i" меньше значения переменной "num"
         */
        for (int i = 0; i < num; i++) {
            if ((i * i) >= num) break; // Прекраиь цикл если i*i >= 100
                System.out.print(i + " ");
        }

        System.out.println("Цикл завершен.");
    }
}
