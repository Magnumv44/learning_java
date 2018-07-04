package com.gmail.vitaliy1984;

/**
 * Файл класса DecrFor.
 * Демонстрирует работу цикла for с произвольным уменьшением
 * @author Виталий Магнум
 */
public class DecrFor {
    public static void main(String[] args) {
        int x;

        for (x = 100; x> -100; x -= 5) {
            System.out.println(x);
        }
    }
}
