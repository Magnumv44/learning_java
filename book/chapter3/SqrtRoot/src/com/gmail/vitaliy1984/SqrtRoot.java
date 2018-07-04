package com.gmail.vitaliy1984;

/**
 * Факл класса SqrtRoot.
 * Программа демонстрирует работу цикла for на примере вычисления квадратного корня
 *
 * @author Виталий Магнум
 */
public class SqrtRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " + num + " равен " + sroot);

            // вычисляем ошибку округления
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
    }
}
