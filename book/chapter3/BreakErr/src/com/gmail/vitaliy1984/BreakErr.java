package com.gmail.vitaliy1984;

/**
 * Файл класса BreakErr.
 *
 * @author Виталий Магнум
 */
public class BreakErr {
    public static void main(String[] args) {
        one: for (int i = 0; i < 3; i++) {
            System.out.println("Проход " + i + ": ");
        }

        for (int j = 0; j < 100; j++) {
            if (j == 100) break one; //Ошибка!
            System.out.println(j + " ");
        }
    }
}
