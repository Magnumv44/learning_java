/*
 * Клас демонстрирущий переопределение конструктора и передачу ему объекта в качестве параметра.
 *
 * @author Magnum
 */
class Summation {
    private int sum;

    // Construct from an int.
    public Summation(int num) {
        this.sum = 0;
        for (int i = 1; i <= num; i++)
            this.sum += i;
    }

    // Construct from another object.
    public Summation(Summation ob) {
        this.sum = ob.sum;
    }

    //
    public int getSum() {
        return sum;
    }
}
