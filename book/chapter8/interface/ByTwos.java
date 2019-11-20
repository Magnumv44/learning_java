/*
 * Класс демонстрирующий реализацию интерфейса.
 * Формируется ряб числе, кажое из которых больше на 2 от предыдущего.
 * Содержит конструктор, все методы описанные в интерфейсе
 * (они обязательно должны быть отмечены как public), и свои поля типа int.
 *
 * @author Magnum
 */
class ByTwos implements Series { // реализация интерфейса
    int start;
    int val;

    // конструктор класса
    public ByTwos() {
        this.start = 0;
        this.val = 0;
    }

    // реализация методов описанных в интерфейсе
    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = this.start;
    }

    public void setStart(int x) {
        this.start = x;
        this.val = x;
    }
}
