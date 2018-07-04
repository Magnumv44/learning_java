package com.gmail.vitaliy1984;

/**
 * Файл класса DWDemo.
 * Программа демонстрирует работу цикла do-while.
 *
 * @author Виталий Магнум
 */
public class DWDemo {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch;

            do {
                System.out.println("Нажмите нужную клавишу, а затем нажмите клавишу <ENTER>: ");
                ch = (char) System.in.read(); // получение символа с клавиатуры
            } while (ch != 'q');
    }
}
