/*
 * Клас содержащий метод main для запуска програмы и теста класа Factorial.
 * Демонстрирует запуск рекурсивного и итеративного методов.
 *
 * @author Magnum
 */
class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();

        System.out.println("Вычисление рекурсивным методом:");
        System.out.println("Факториал 1 равен " + f.factR(1));
        System.out.println("Факториал 3 равен " + f.factR(3));
        System.out.println("Факториал 4 равен " + f.factR(4));
        System.out.println("Факториал 5 равен " + f.factR(5));

        System.out.println();

        System.out.println("Вычисление итеративным методом:");
        System.out.println("Факториал 1 равен " + f.factI(1));
        System.out.println("Факториалf 3 равен " + f.factI(3));
        System.out.println("Факториал 4 равен " + f.factI(4));
        System.out.println("Факториал 5 равен " + f.factI(5));
    }
}
