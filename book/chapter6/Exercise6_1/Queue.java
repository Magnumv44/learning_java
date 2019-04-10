/*
 * Упражнение 6.1.
 * Демонстрирующий работу нециклического заполнения
 * массива на примере очереди с применением модификаторов доступа.
 *
 * @author Magnum
 */

/**
 * Клас реализующий очередь для хранения
 */
class Queue {
    private char q[];            // массив для хранения элементов
    private int putloc, getloc;  // индейсы для вставки и извлечения дпнных массива

    Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    // Метод помещаюй символ в очередь
    void put(char ch) {
        if (putloc == q.length-1) {
            System.out.println(" - Очередь заполнена.");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    // Метод извлекающий символ из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}
