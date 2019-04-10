/**
 * Класс демонстрирующий как будет работать помещение и извление элементов массива.
 */
class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("использование очереди bigQ для сохранения алфавита");

        // Заполняем массив буквами
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        // извлекаем символы из массива и выводим их на экран
        System.out.println("Содержимое очереди bigQ: ");

        for (i = 0; i < 26; i++) {
            ch = bigQ.get();

            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }

        System.out.println("\n");

        System.out.println("использование очереди smallQ для генерации ошибок");

        // использование очереди smallQ для генерации ошибок
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }

        System.out.println();

        // Дополнительные ошибки при обращении к очереди smallQ
        System.out.println("Содержимое smallQ: ");

        for (i = 0; i < 5; i++) {
            ch = smallQ.get();

            if (ch != (char) 0) {
                System.out.print(ch);
            }
        }

        // Этот код приведет к ошибке и приложение не будет скомпилировано
        // Queue test = new Queue(10);
        // test q[0] = 99;
        // test.putloc = -100;
    }
}