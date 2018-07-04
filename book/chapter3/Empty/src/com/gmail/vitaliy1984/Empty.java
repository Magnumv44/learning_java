package com.gmail.vitaliy1984;

/**
 * Файл класса Empty.
 * Программа демонстрирующая работу цикла с инкрементацией внутри цикла.
 *
 * @author Виталий Магнум
 */
public class Empty {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; ) {
            System.out.println("Проход №" + i);
            i++; // инкрементирование переменной внутри цикла
        }
    }
}
