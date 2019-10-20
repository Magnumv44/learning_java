/*
 * Клас демонстрирущий переопределение конструктора и передачу ему объекта в качестве параметра.
 *
 * @author Magnum
 */
class Summation {
    private int sum;

    // Создани е объекта на основе целочисленного значения
    public Summation(int num) {
        this.sum = 0;
        for (int i = 1; i <= num; i++)
            this.sum += i;
    }

    // Создание объкта на основе второго (в качестве параметра конструктору передается объект)
    public Summation(Summation ob) {
        this.sum = ob.sum;
    }

    // Геттер для соблюдения парвил инкапсуляции
    public int getSum() {
        return sum;
    }
}
