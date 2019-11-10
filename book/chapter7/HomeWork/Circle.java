/*
 * Домашнее задание.
 * Создайте подкласс Circle, наследуемый от класса TwoDShape. В нем должен быть определено метод area(),
 * вычисляющий площадь круга, а также конструктор с ключевым словом super для инициализации членов, унаследованных
 * от класса TwoDShape.
 *
 * @author Magnum
 */
class Circle extends TwoDShape {
    private final double PI = 3.14; // константа числа Пи
    private int radius;             // радиус круга

    public Circle(double x, String n, int radius) {
        super(x, n); // вызов конструктора суперкласса
        this.radius = radius;
    }

    // переопределенный метод area() вычиляющий площадь круга
    public double area() {
        return (PI * radius) * 2;
    }
}
