package com.gmail.vitaliy1984;

/**
 * Программа SwitchDemo.
 * Демонстрирует работу усправляющего оператора switch.
 *
 * @author Виталий Магнум
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("i равно нулю");
                    break;
                case 1:
                    System.out.println("i равно еденице");
                    break;
                case 2:
                    System.out.println("i равно двум");
                    break;
                case 3:
                    System.out.println("i равно трем");
                    break;
                case 4:
                    System.out.println("i равно четырем");
                    break;
                default:
                    System.out.println("i равно или больше пяти");
            }
        }
    }
}
