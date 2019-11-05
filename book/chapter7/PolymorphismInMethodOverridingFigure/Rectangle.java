/*
 * Подкласс для создания прямоугольников.
 * Демонстрирующий принцип наследования от другого класса.
 * Содержит метод расчитывающий площать прямоугольника и метод определения является
 * ли прямоугольник квадратом.
 * Необходим для реализации динамической диспетчирезации методов.
 * Условно будет считатся подклассом.
 *
 * @version 8
 * @author Magnum
 */
class Rectangle extends TwoDShape {
    // Полностью наследуемый конструктор по умолчанию
    public Rectangle() {
        super();
    }

    // Конструктор прямоугольника
    public Rectangle(double w, double h) {
        super(w, h, "прямоугольник"); // передаем параметры конструктору суперкласса
    }

    // Construct a square.
    public Rectangle(double x) {
        super(x, "прямоугольник"); // передаем параметры конструктору суперкласса
    }

    // Конструктор принимающий объекты в качестве параметров
    public Rectangle(Rectangle ob) {
        super(ob); // передаем объект конструктору суперклассу
    }

    public boolean isSquare() {
        if(getWidth() == getHeight()) {
            return true;
        } else {
            return false;
        }
    }

    // Переопределяем метод суперкласса
    @Override
    public double area() {
        return getWidth() * getHeight();
    }
}
