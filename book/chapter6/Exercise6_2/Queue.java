/*
 * Упражнение 6.2.
 * Демонстрирующие переопределение конструктора, который в качестве параметра будет
 * принимать числа, символьные массивы и объекты.
 *
 * @version 2
 * @author Magnum
 */

/**
 * Клас реализующий очередь для хранения символов
 */
class Queue {
    private char q[];            // массив для хранения элементов
    private int putloc, getloc;  // индейсы для вставки и извлечения дпнных массива

    // Создание пустой очереди размером заданным в качестве параметра у конструктора
    public Queue(int size) {
        this.q = new char[size + 1]; // Выделение памяди для очереди
        this.putloc = this.getloc = 0;
    }

    // Конструктор создающий очередь на основе имеющегося объкта Queue
    public Queue(Queue ob) {
        this.putloc = ob.putloc;
        this.getloc = ob.getloc;
        this.q = new char[ob.q.length];

        // Копируем элементы в очередь
        for (int i = this.getloc + 1; i <= this.putloc; i++) {
            this.q[i] = ob.q[i];
        }
    }

    // Конструктор создающий очередь на основе массива исходных значений
    public Queue(char a[]) {
        this.putloc = 0;
        this.getloc = 0;
        this.q = new char[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }

    // Метод помещаюй символ в очередь
    public void put(char ch) {
        if (putloc == q.length - 1) {
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
