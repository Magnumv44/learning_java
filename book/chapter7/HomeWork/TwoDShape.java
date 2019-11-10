/*
 * Абстрактный описывающий фигуру состояющу из двух сторон.
 * Содержит конструкторы, методы доступа к полями абстрактныйметод расчетаподиигуры.
 * Условно будет считатся суперклассом.
 * Данный клас не может иметь свои объекты!
 *
 * @version 10
 * @author Magnum
 */
abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    // Конструктор по умолчанию
    public TwoDShape() {
        this.width = height = 0.0;
        this.name = "none";
    }

    // Параметрезированный конструктор
    public TwoDShape(double w, double h, String n) {
        this.width = w;
        this.height = h;
        this.name = n;
    }

    // Конструктор где высоте и ширине присваевается одно итоже значение
    public TwoDShape(double x, String n) {
        this.width = x;
        this.height = x;
        this.name = n;
    }

    // Конструктор принимающий в виде параметра объект
    public TwoDShape(TwoDShape ob) {
        this.width = ob.width;
        this.height = ob.height;
        this.name = ob.name;
    }

    // Геттеры и Сеттеры
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public String getName() {
        return name;
    }

    public void showDim() {
        System.out.println("ширина " + width + "\nвысота " + height);
    }

    abstract double area();
}
