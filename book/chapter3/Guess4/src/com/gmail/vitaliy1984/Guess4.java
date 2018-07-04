package com.gmail.vitaliy1984;

/**
 * Файл класса Guess4.
 * Промма игрі по угадіванию буквы.
 *
 * @author Виталий Магнум
 * @version 4
 */
public class Guess4 {
    public static void main(String[] args)
        throws java.io.IOException {
            char ch, ignore, answer = 'S';

            do {
                System.out.println("Задумана буква из диапазона A-Z.");
                System.out.println("Попытайтесь ее угадать: ");

                //Получаем символ с клавиатуры
                ch = (char) System.in.read();

                /* Отбрасываем все лишние символы во входном буфере
                   Если его убрать, то после ввода будет дважды происходить
                   проверка симвла и вывод на экран двух сообщений если был введен
                   не верный символ
                */
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

                if (ch == answer) {
                    System.out.println("** Правильно! **");
                } else {
                    System.out.print("...Извините, нужная буква находится ");
                    if (ch < answer) {
                        System.out.println("ближе к концу алфавита");
                    } else {
                        System.out.println("ближе к началу алфавита");
                    }

                    System.out.println("Повторите попытку!\n");
                }
            } while (answer != ch);
    }
}
