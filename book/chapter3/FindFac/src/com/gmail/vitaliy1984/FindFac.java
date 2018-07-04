package com.gmail.vitaliy1984;

/**
 * Файл класса FindFac.
 *
 * Программа демонстрирующая работу вложенных циклов
 * для нахождения делителей числе от 2 до 100.
 *
 * @author Виталий Магнум
 */
public class FindFac {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            System.out.print("Делители " + i + ": ");

            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
