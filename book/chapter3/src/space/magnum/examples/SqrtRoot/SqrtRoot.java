package space.magnum.examples.SqrtRoot;

/**
 * Файл класу SqrtRoot.
 * Програма демонструє роботу циклу for на прикладі обчислення квадратного кореня чисел від 1 до 99
 *
 */
public class SqrtRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Квадратний корень числа " + num + " дорівнює " + sroot);

            // обчислюєм помилку округлення
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
    }
}
