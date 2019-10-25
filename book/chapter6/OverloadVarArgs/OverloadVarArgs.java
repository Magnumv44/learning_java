/*
 * Клас демонстрирующий реализацию метода с переменным числом аргументов и его перегрузка.
 *
 * @author Magnum
 */
class OverloadVarArgs {

    public static void vaTest(int... v) {
        System.out.println("vaTest(int ...): " + "Количество аргументов: " + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("  аргумент " + i + ": " + v[i]);
        }

        System.out.println();
    }

    public static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean ...): " + "Количество аргументов: " + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("  аргумент " + i + ": " + v[i]);
        }

        System.out.println();
    }

    public static void vaTest(String msg, int... v) {
        System.out.println("vaTest(String, int ...): " + msg + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println("  аргумент " + i + ": " + v[i]);
        }

        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3);
        vaTest("Тестирование: ", 10, 20);
        vaTest(true, false, false);
    }
}
