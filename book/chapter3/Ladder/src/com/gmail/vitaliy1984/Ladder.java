package com.gmail.vitaliy1984;

/**
 * Демонстрация работы усправляющих кострукций if ele if.
 */
public class Ladder {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 6; x++) {
            if (x == 1) {
                System.out.println("x равно еденице");
            } else if (x == 2) {
                System.out.println("x равно двум");
            } else if (x == 3) {
                System.out.println("x равно трем");
            } else if (x == 4) {
                System.out.println("x равно четырем");
            } else {
                //Условие, выполняемое по умолчанию
                System.out.println("Значение x находитс вне диапазона 1 - 4");
            }
        }
    }
}
