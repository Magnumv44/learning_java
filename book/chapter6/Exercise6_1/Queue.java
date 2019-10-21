/*
 * Упражнение 6.1.
 * Демонстрирующие работу нециклического заполнения
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

    public Queue(int size) {
        this.q = new char[size + 1];
        this.putloc = this.getloc = 0;
    }

    // Метод помещаюй символ в очередь
    public void put(char ch) {
        if (putloc == q.length-1) {
            System.out.println(" - Очередь заполнена.");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    // Метод извлекающий символ из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}
