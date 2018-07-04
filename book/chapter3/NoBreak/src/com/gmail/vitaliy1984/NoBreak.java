package com.gmail.vitaliy1984;

/**
 * Программа NoBreak.
 * Деменстрирующая работу управлющего оператор switch без break
 *
 * @author Виталий Магнум
 */
public class NoBreak {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i меньше еденицы");
                case 1:
                    System.out.println("i меньше двух");
                case 2:
                    System.out.println("i меньше трех");
                case 3:
                    System.out.println("i меньше четырех");
                case 4:
                    System.out.println("i меньше пяти");
            }

            System.out.println();
        }
    }
}
