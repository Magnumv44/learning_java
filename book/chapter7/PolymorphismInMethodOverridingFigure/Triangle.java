/*
 * Класс определяющий треугольник.
 * Демонстрирующий принцип наследования от другого класса.
 * Содержит конструкторы метод расчитывающий площать треугорьника,
 * метод вывода на экран стиля треугольника.
 * Необходим для реализации динамической диспетчирезации методов.
 * Условно будет считатся подклассом.
 *
 * @version 8
 * @author Magnum
 */
class Triangle extends TwoDShape {
    private String style;

    // Конструктор по умолчанию
    public Triangle() {
        super();
        this.style = "none";
    }

    // Конструктор для Triangle.
    public Triangle(String s, double w, double h) {
        super(w, h, "треугольник");

        this.style = s;
    }

    // Конструктор с одним параметром
    public Triangle(double x) {
        super(x, "треугольник"); // вызываем конструктор суперкласса

        this.style = "закрашенный";
    }

    // Конструктор принимающий объекты в качестве параметров
    public Triangle(Triangle ob) {
        super(ob); // передаем объект конструктору суперклассу

        this.style = ob.style;
    }

    // Переопределяем метод суперкласса
    @Override
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.println("стиль треугольника: " + style);
    }
}
