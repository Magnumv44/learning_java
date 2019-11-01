/*
 * Класс определяющий треугольник.
 * Наследуется от класса TwoDShape.
 * Демонтрирует создание конструктора с доступом к полям суперкласса
 * при помощи методов доступа.
 *
 * @version 3
 * @author Magnum
 */
class Triangle extends TwoDShape {
    private String style; // Стиль треугоника

    // Конструктор класса с инициализацией полей суперкласса
    public Triangle(String style, double w, double h) {
        // поля суперкласса инициализируются через сеттеры
        setWidth(w);
        setHeight(h);

        this.style = style;
    }

    /* Метод расчета площади треугольника
       выдаст ошибку при компиляции так как поля width и height
       у суперкласса закрыты (private)
     */
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    // Метод вывода на экран стиля треуагольника
    public void showStyle() {
        System.out.println("треугольник " + style);
    }
}
