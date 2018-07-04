package com.gmail.vitaliy1984;

/**
 * Файл класса Break5.
 * Программы демонстрируюзая работе оператора break с выходом
 * за пределы вложенных циклов.
 *
 * @author Виталий Магнум
 */
public class Break5 {
    public static void main(String[] args) {

        done:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10 ; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done; // переход к метке done
                }
                System.out.println("После цикла k");
            }
            System.out.println("После цикла j");
        }
        System.out.println("После цикла i");
    }
}
