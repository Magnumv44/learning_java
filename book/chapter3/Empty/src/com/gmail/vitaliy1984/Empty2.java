package com.gmail.vitaliy1984;

/**
 * Файл класса Empty2.
 * Программа демонстрирующая работу цикла с инициализацией
 * переменной перед циклом и нкрементацией внутри цикла.
 *
 * @author Виталий Магнум
 */
public class Empty2 {
    public static void main(String[] args) {
        int i;
        i = 0;

        for ( ; i < 10; ) {
            System.out.println("Проход №" + i);
            i++; // инкрементирование переменной внутри цикла
        }
    }
}
