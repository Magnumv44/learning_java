package com.gmail.vitaliy1984;

/**
 * Файл класса Break4.
 * Программа демонстрирующая работу оператора break с меткой.
 *
 * @author Виталий Магнум
 */
public class Break4 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i < 4; i++) {
            one: {
                two: {
                    three: {
                        System.out.println("\ni равно " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                        //Эта строка и кажется принадлежащей верхнему if но на жкран не выведется
                        System.out.println("не будет выведено");
                    }
                    System.out.println("После блока three");
                }
                System.out.println("После блока two");
            }
            System.out.println("После блока one");
        }
        System.out.println("После цикла for");
    }
}
