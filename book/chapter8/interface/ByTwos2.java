/*
 * Класс демонстрирующий реализацию интерфейса.
 * Формируется ряб числе, кажое из которых больше на 2 от предыдущего.
 * Содержит конструктор, все методы описанные в интерфейсе
 * (они обязательно должны быть отмечены как public), и свои поля типа int.
 * А так же дополнительный метод не описанный в интерфейсе, который
 * вовзвращает предыдущее число.
 *
 * @version 2
 * @author Magnum
 */
class ByTwos implements Series { // реализация интерфейса
    int start;
    int val;
    int prev;

    // конструктор класса
    public ByTwos(int start, int val, int prev) {
        this.start = 0;
        this.val = 0;
        this.prev = -2;
    }

    // реализация методов описанных в интерфейсе
    public int getNext() {
        this.prev = val;
        this.val += 2;
        return val;
    }

    public void reset() {
        this.val = this.start;
        this.prev = this.start - 2;
    }

    public void setStart(int x) {
        this.start = x;
        this.val = x;
        this.prev = x - 2;
    }

    /*
      дополнительный метод который не описан в интерфейсе, для демонтсрации
      что классы могут иметь и свои методы не описанные в интерфейсе
     */
    public int getPrevious() {
        return prev;
    }
}
