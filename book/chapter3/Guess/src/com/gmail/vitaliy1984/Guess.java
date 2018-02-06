package com.gmail.vitaliy1984;

/**
 * Игра в угадывание букв версии.
 *
 * @version 1
 */
public class Guess {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch, answer = 'S';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char) System.in.read();  //Получение символа введенного с клавиатуры

        if (ch == answer) System.out.println("** Правильно! **");
    }
}
