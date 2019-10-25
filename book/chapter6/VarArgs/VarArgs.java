/*
 * Клас демонстрирующий реализацию метода с переменным числом аргументов.
 *
 * @author Magnum
 */
class VarArgs {

    // Метод vaTest() допускает переменное число аргументов или вовсе их отсуствие
    public static void vaTest(int... v) {
        System.out.println("Количество аргументов: " + v.length);

        /* Если количество аргументов равно 0,
           то выводим сообщение что аргументов нет
         */
        if (v.length == 0) {
            System.out.println("Нет аргументов для отображения.");
            return;
        }

        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++)
            System.out.println("  аргумент " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String args[]) {

        // Метод vaTest() может вызыватся с перменным числом аргументов или вовсе без них
        vaTest(10);      // 1 аргумент
        vaTest(1, 2, 3); // 3 аргумента
        vaTest();        // без аргументов
    }
}
