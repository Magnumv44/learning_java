package com.gmail.vitaliy1984;

/**
 * Файл класса ForTest.
 * Программа демонстрирует работу цикла for с условием выхожа задающимся с клавиатуры.
 *
 * @author Виталий Магнум
 */
public class ForTest {
    public static void main(String[] args)
        throws java.io.IOException {
            int i;

            System.out.println("Для отановки нажмите клавишу S");

            for (i = 0; (char) System.in.read() != 'S'; i++) {
                System.out.println("Проход №" + i);
        }
    }
}
