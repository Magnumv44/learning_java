/*
 * Класс определяющий треугольник.
 * Наследуется от класса TwoDShape.
 * Демонтрирует создание конструктора с доступом к полям суперкласса
 * при помощи ключевого слова super с помощью которого происходит наследование
 * конструктора сепуркласса.
 *
 * @version 4
 * @author Magnum
 */
class Triangle extends TwoDShape {
    private String style; // Стиль треугоника

    // Конструктор класса с инициализацией полей суперкласса
    public Triangle(String style, double w, double h) {
        /* поля суперкласса инициализируются с помощью ключевого слова super()
           вызывающего конструктор суперкласса.
         */
        super(w, h);

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
