/*
 * Программа демонстрирующая как проиходит перегрузка методов.
 *
 * @author Magnum
 */
class Overload {
    // исходный метод
    public void ovlDemo() {
        System.out.println("Метод без параметров.");
    }

    // Перегрузка метода ovlDemo для одного параметра типа int
    public void ovlDemo(int a) {
        System.out.println("Один параметр: " + a);
    }

    // Перегрузка метода ovlDemo для двух параметров типа int
    public int ovlDemo(int a, int b) {
        System.out.println("Два параметра типа int: " + a + " " + b);
        return a + b;
    }

    // Перегрузка метода ovlDemo для двух параметров типа double
    public double ovlDemo(double a, double b) {
        System.out.println("Два параметра типа double: " + a + " " + b);
        return a + b;
    }
}
