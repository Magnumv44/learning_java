package com.gmail.vitaliy1984;

/**
 * Файл класса Comma.
 * Программма дементрирует работе цикла for с несколькими переменными в условии
 * @author Виталий Магнум
 */
public class Comma {
    public static void main(String[] args) {
        int i, j;

        for (i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i и j: " + i + " " + j);
        }
    }
}
