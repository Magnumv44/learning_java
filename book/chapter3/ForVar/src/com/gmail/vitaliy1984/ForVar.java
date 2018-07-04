package com.gmail.vitaliy1984;

/**
 * Файл класса ForVar.
 * Программа демуонстрирует работу цикла с объявлением
 * управляющей переменной в самом цикле.
 *
 * @author Виталий Магнум
 */
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        //Вычесление факториала чисел т 1 до 5
        for (int i = 1; i < 5; i++) {
            sum += i; //переменная i доступна только внутри цикла
            fact *= i;
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
