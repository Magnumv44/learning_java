package com.gmail.vitaliy1984;

/**
 * Файл класса WhileDemo.
 * Программа демонстрирует работу цикла while.
 *
 * @author Виталий Магнум
 */
public class WhileDemo {
    public static void main(String[] args) {
        char ch = 'a';

        //вывод букв англиского алфавита используя цикл while
        while (ch <= 'z') {
            System.out.println(ch);
            ch++;
        }
    }
}
