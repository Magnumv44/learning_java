/*
 * Класс определяющий треугольник.
 * Наследуется от класса TwoDShape.
 * Демонтрирует ошибку при компиляции в случае если поля суперкласса закрыты (private).
 *
 * @version 2
 * @author Magnum
 */
class Triangle extends TwoDShape {
    public String style; // Стиль треугоника

    /* Метод расчета площади треугольника
       выдаст ошибку при компиляции так как поля width и height
       у суперкласса закрыты (private)
     */
    public double area() {
        return width * height / 2;
    }

    // Метод вывода на экран стиля треуагольника
    public void showStyle() {
        System.out.println("треугольник " + style);
    }
}
