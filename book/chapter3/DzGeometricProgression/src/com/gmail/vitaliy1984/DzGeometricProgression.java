package com.gmail.vitaliy1984;

/**
 * Файл класса DzGeometricProgression.
 *
 * Описание задания:
 * Итерационное выражение для цикла for не обязательно должно
 * изменять переменную цикла на фиксированную величину. Эта переменная
 * может принимать произвольные значения. Напишите программу,
 * использующую цикл for для вывода чисел в геометрической прогрессии 1, 2, 4, 8, 16, 32 и т.д.
 *
 * @author Виталий Магнум
 */
public class DzGeometricProgression {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i += i) {
            System.out.println(i);
        }
    }
}
