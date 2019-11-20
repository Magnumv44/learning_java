/*
 * Класс демонстрирующий многократное использование интерфейса.
 * Формируется ряб числе, кажое из которых больше на 3 от предыдущего.
 * Содержит конструктор, все методы описанные в интерфейсе
 * (они обязательно должны быть отмечены как public), и свои поля типа int.
 *
 * @author Magnum
 */
class ByThrees implements Series { // реализация интерфейса
    int start;
    int val;

    public ByThrees() {
        this.start = 0;
        this.val = 0;
    }

    public int getNext() {
        this.val += 3;
        return val;
    }

    public void reset() {
        this.start = 0;
        this.val = 0;
    }

    public void setStart(int x) {
        this.start = x;
        this.val = x;
    }
}
