/*
 * Класс определяющий треугольник.
 * Наследуется от класса TwoDShape2.
 * Демонтрирует обращение к закрытым полям класса TwoDShape2
 * посредством геттеров и сеттеров.
 *
 * @version 3
 * @author Magnum
 */
class Triangle2 extends TwoDShape2 {
    public String style; // Стиль треугоника

    // Метод расчета площади треугольника
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    // Метод вывода на экран стиля треуагольника
    public void showStyle() {
        System.out.println("треугольник " + style);
    }
}
