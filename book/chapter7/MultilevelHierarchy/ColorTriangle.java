/*
 * Класс определяющий цветной треугольник.
 * Наследуется от класса Triangle.
 * Демонтрирует принцип наследование от суперкласса Triangle и
 * от его вышестоящего родителя имеющего некоторое число
 * конструкторов и их переопределение.
 *
 * @version 1
 * @author Magnum
 */
class ColorTriangle extends Triangle {
    private String color;

    // конструктор класса наследующий поля своих родителей
    public ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);

        this.color = c;
    }

    // геттер и сеттер для доступа к переменной цвета триугольника
    public String getColor() {
        return color;
    }

    public void showColor() {
        System.out.println("цвет: " + color);
    }
}
