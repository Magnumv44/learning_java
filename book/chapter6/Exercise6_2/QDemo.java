/**
 * Класс демонстрирующий как будет работать помещение и извление элементов массива.
 */
class QDemo {
    public static void main(String[] args) {
        // Создаем пустую очередь для хранения 10 символов
        Queue q1 = new Queue(10);

        // Создаем масив символов для передачи их в качестве аргумента конструктору
        char name[] = {'T', 'o', 'm'};
        // Создаем очередь и передаем ей массив символом в качестве аргумента для конструктора
        Queue q2 = new Queue(name);

        char ch;
        int i;

        // Заполняем очередь q1 буквами
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        // Создаем третью очередь и в качестве аргумента для конструктора передаем ей объект q1
        Queue q3 = new Queue(q1);

        // Смотрим содержимое очередей
        System.out.println("Содержимое очереди q1: ");

        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Содержимое очереди q2: ");

        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Содержимое очереди q1: ");

        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
