package com.gmail.vitaliy1984;

/**
 * Файл класса ConToLabel.
 *
 * Программа демонстрирубщая работу оператора continue с меткой
 *
 * @author Виталий Магнум
 */
public class ConToLabel {
    public static void main(String[] args) {
        outerloop:
            for (int i = 1; i < 10; i++) {
                System.out.print("\nВнешний цикл: проход " + i + ", внутренний цикл: ");

                for (int j = 1; j < 10; j++) {
                    if (j == 5) continue  outerloop; // Подолжить внешний цикл

                    System.out.print(j);
                }
            }
    }
}
