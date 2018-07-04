package com.gmail.vitaliy1984;

/**
 * Файл класса Break2.
 * Программа считывающая данных с клавиатуры до тех пор,
 * пока не будет введена буква q
 *
 * @author Виталий Магнум
 */
public class Break2 {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch;

            for ( ; ; ) {
                ch = (char) System.in.read(); //получаем символ с клавиатуры

                if (ch == 'q') {
                    break;
                }
            }

        System.out.println("Вы нажали клавишу q");
    }
}
