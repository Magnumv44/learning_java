/*
 * Программа демонстрирующая работу тернарного оператора для предотвращения деления на 0.
 * Тернарный оператор используется как условие для условнгого оператора if.
 *
 * @author Magnum
 */
class NoZeroDiv2 {
    public static void main(String[] args) {
        for (int i = -5; i < 6; i++) {
            if (i != 0 ? true : false) {
                System.out.println("100 / " + i + " равно " + 100 / i);
            }
        }
    }
}