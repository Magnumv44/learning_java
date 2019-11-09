/*
 * Класс определяющий треугольник.
 * Демонстрирующий принцип наследования от абстрактного класса.
 * Содержит конструкторы метод расчитывающий площать треугорьника
 * (котрый переопределен, что бы этот клас не стал абстрактным),
 * метод вывода на экран стиля треугольника.
 * Условно будет считатся подклассом.
 *
 * @version 9
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

    // Переопределяем метод суперкласса, кторый должен быть переопределен что-бы класс не стал абстрактным
    @Override
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.println("стиль треугольника: " + style);
    }
}
