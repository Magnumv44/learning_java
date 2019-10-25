/*
 * Клас демонстрирующий реализацию метода с переменным числом аргументов.
 * Отличием является то, что помимо аргумента с переменным числом
 * метод принимает и обычные параменты.
 *
 * @version 2
 * @author Magnum
 */
class VarArgs2 {

    // Здесь msg - обычный параметр
    // а v - массив параметров переменной длинны
    public static void vaTest(String msg, int... v) {

        if (v.length == 0) {
            System.out.println(msg);
            return;
        }

        System.out.println(msg + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++)
            System.out.println("  аргумент: " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String args[]) {
        vaTest("Один аргумент в массиве: ", 10);
        vaTest("Три аргумента в массиве: ", 1, 2, 3);
        vaTest("Нет аргументов в массиве.");
    }
}
