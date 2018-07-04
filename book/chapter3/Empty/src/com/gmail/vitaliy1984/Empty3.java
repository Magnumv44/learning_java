package com.gmail.vitaliy1984;

/**
 * Файл класса Empty.
 * Программа демонстрирующая работу цикла без тела цикла.
 *
 * @author Виталий Магнум
 */
public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for (i = 1; i <= 5; sum += i++) ; // в цикле отсуствует тело цикила

        System.out.println("Сумм: " + sum);
    }
}
